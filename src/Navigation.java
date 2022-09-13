import java.util.ArrayList;
import java.util.List;

public class Navigation {
    private GPS gps;
    private List<VisualSensor> visualSensors = new ArrayList<>();

    public Navigation() {
        this.gps = new GPS();
        visualSensors.add(new VisualSensor());
        visualSensors.add(new VisualSensor());
    }

    public boolean SendHeartBeat() {
        return (gps.findNewRoute() || gps.isDisconnected()) && checkSensors();
    }

    private boolean checkSensors(){
        for(VisualSensor sensor:visualSensors) {
            if(sensor.detectObstacle() || sensor.isBroken()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Navigation n = new Navigation();
        System.out.println(n.SendHeartBeat());
    }
}
