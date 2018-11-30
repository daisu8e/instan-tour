package instant_tour;

import instant_tour.schedule.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {

  private int id;
  private List<Route> routes;
  private List<Location> route;
  private LocalDateTime startTime;

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
    Route route;
    LocalDateTime dateTime = this.startTime;
    String time;
    Location start;
    Location end;
    for (int i = 0; i < this.routes.size(); i++) {
      route = this.routes.get(i);

      if (i == 0) {
        start = route.getStart();
        time = DateTimeFormatter.ofPattern("H:mm").format(dateTime);
        System.out.println("  + " + time + " @ " + start);
      }

      for (int j = 0; j < 3; j++) {
        System.out.println("  |");
      }

      start = route.getStart();
      end = route.getEnd();
      dateTime = dateTime.plusHours(start.getStayTime().getHours() + route.getMoveTime().getHours());
      time = DateTimeFormatter.ofPattern("H:mm").format(dateTime);
      System.out.println("  + " + time + " @ " + end);
    }
  }

  public void show(int point) {
    Route route;
    LocalDateTime dateTime = this.startTime;
    String time;
    Location start;
    Location end;
    int line = 0;
    String arrow = "";
    for (int i = 0; i < this.routes.size(); i++) {
      route = this.routes.get(i);

      if (i == 0) {
        start = route.getStart();
        time = DateTimeFormatter.ofPattern("H:mm").format(dateTime);
        arrow = line == point ? " -> " : "    ";
        System.out.println(arrow + "+ " + time + " @ " + start);
        line++;
      }

      for (int j = 0; j < 3; j++) {
        arrow = line == point ? " -> " : "    ";
        System.out.println(arrow + "|");
        line++;
      }

      start = route.getStart();
      end = route.getEnd();
      dateTime = dateTime.plusHours(start.getStayTime().getHours() + route.getMoveTime().getHours());
      time = DateTimeFormatter.ofPattern("H:mm").format(dateTime);
      arrow = line == point ? " -> " : "    ";
      System.out.println(arrow + "+ " + time + " @ " + end);
      line++;
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

  public void setStartTime() {
     LocalDateTime now = LocalDateTime.now();
     this.startTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 10, 0, 0);
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
