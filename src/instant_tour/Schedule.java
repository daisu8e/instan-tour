package instant_tour;

import instant_tour.schedule.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {

  private int id;
  private List<Route> routes;
  private List<Location> route;

  public Schedule(int id, List<Route> routes) {
    this.id = id;
    this.routes = routes;
    this.route = mergeRoutes();
  }

  public String toString() {
    List<String> names = new ArrayList<>();
    for (Route route : this.routes) {
      Location[] locations = {route.getStart(), route.getEnd()};
      for (Location location : locations) {
        if (!(location instanceof Sight)) continue;
        if (names.contains(location.getName())) continue;
        names.add(location.getName());
      }
    }
    return String.join(" > ", names);
  }

  public List<Route> getRoutes() {
    return this.routes;
  }

  public List<Location> getRoute() {
    return this.route;
  }

  public void show() {
    for (int i = 0; i < this.route.size(); i++) {
      String line = "";
      Location location = this.route.get(i);
      if (location != null) line += "  + 10:00 @ " + location;
      else                  line += "  |";
      System.out.println(line);
    }
  }

  public void show(int point) {
    for (int i = 0; i < this.route.size(); i++) {
      String line = i == point ? " -> " : "    ";
      Location location = this.route.get(i);
      if (location != null) line += "+ 10:00 @ " + location;
      else                  line += "|";
      System.out.println(line);
    }
  }

  public void addHome(Home home) {
    Route firstRoute = this.routes.get(0);
    Route lastRoute = this.routes.get(this.routes.size() - 1);
    Route newFirstRoute = new Route(home, new Time("1"), firstRoute.getStart());
    Route newLastRoute = new Route(lastRoute.getEnd(), new Time("1"), home);
    this.routes.add(0, newFirstRoute);
    this.routes.add(this.routes.size(), newLastRoute);
    this.route = mergeRoutes();
  }

  private List<Location> mergeRoutes() {
    List<Location> list = new ArrayList<>();
    for (int i = 0; i < this.routes.size(); i++) {
      if (i == 0) list.add(this.routes.get(i).getStart());
      list.add(null);
      list.add(null);
      list.add(null);
      list.add(this.routes.get(i).getEnd());
    }
    return list;
  }

  public static Map<Integer, Schedule> find() {
    Map<Integer, Schedule> map = new HashMap<>();
    Map<Integer, Route> routes = Route.find();
    for (String[] row : Repository.data) {
      int id = Integer.parseInt(row[0]);
      List<Route> list = new ArrayList<>();
      for (int i = 1; i < row.length; i++) {
        list.add(routes.get(Integer.parseInt(row[i])));
      }
      map.put(id, new Schedule(id, list));
    }
    return map;
  }
}
