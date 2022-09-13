import java.util.ArrayList;
import java.util.List;

public class GPS {
    private List<Route> routes = new ArrayList<>();

    public boolean findNewRoute() {
        double startLat = Math.random() * 95;
        double endLat = Math.random() * 95;
        double startLong = Math.random() * 190;
        double endLong = Math.random() * 190;
        System.out.println(startLat);
        System.out.println(endLat);
        System.out.println(startLong);
        System.out.println(endLong);
        Route route = new Route(startLat, endLat, startLong, endLong);
        if(route.isValid()) {
            routes.add(route);
            return true;
        }
        return false;
    }

    public boolean isDisconnected() {
        return (Math.random() * 100) <= 1;
    }

    public List<Route> getRoutes() {
        return this.routes;
    }
}
