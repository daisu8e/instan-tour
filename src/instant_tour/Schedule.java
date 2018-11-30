package instant_tour;

import instant_tour.schedule.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {

  private int id;
  private List<Route> routes;

  public Schedule(int id, List<Route> routes) {
    this.id = id;
    this.routes = routes;
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
