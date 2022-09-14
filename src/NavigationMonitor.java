import java.util.concurrent.TimeUnit;
import java.util.Date;

public class NavigationMonitor {
    private int checkingInterval;
    private int checkingTime;
    private int expireTime;
    private int lastUpdatedTime;
    private FaultMonitor faultMonitor;

    public NavigationMonitor() {
        this.checkingInterval = 3;
        this.checkingTime = 0;
        this.expireTime = 0;
        this.lastUpdatedTime = 0;
        this.faultMonitor = new FaultMonitor();
    }

    public boolean checkAlive(Thread nav) {
        this.updateTime();
        return nav.isAlive();
    }

    public void updateTime() {
        
    }

    public void notifyFault() {
        this.faultMonitor.sendFaultNotification(this.expireTime);
    }

    public void monitor() {
        try {
            System.out.print("\nBeginning Navigation Monitor\n");
            for(;;) {
                Date date = new Date();
                Thread newNavigation = new Thread(new Navigation());
                newNavigation.start();
                while(checkAlive(newNavigation) == true) {
                    this.lastUpdatedTime = this.checkingTime;
                    this.checkingTime = (int)date.getTime();
                    TimeUnit.SECONDS.sleep(this.checkingInterval);
                }
                this.expireTime = (int)date.getTime();
                notifyFault();
            }
        }
        catch(Exception ex) {
            System.out.println("ERROR: "+ex);
        }
    }
}
