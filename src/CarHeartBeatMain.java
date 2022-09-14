
public class CarHeartBeatMain {
    
    public static void main(String[] args) {
        System.out.println("\nBeginning CarHeartBeatMonitor System Test...\n");
        NavigationMonitor navMonitor = new NavigationMonitor();
        navMonitor.monitor();
    }
}
