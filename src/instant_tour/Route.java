package instant_tour;

import instant_tour.route.Repository;

import java.util.HashMap;
import java.util.Map;

public class Route {

  private int id;
  private Location start;
  private Time time;
  private Location end;

  public Route(int id, Location start, Time time, Location end) {
    this.id = id;
    this.start = start;
    this.time = time;
    this.end = end;
  }

  public Route(Location start, Time time, Location end) {
    this.start = start;
    this.time = time;
    this.end = end;
  }

  public Location getStart() {
    return this.start;
  }

  public Location getEnd() {
    return this.end;
  }

  public static Map<Integer, Route> find() {
    Map<Integer, Route> map = new HashMap<>();
    Map<Integer, Location> locations = Location.find();
    for (String[] row : Repository.data) {
      int id = Integer.parseInt(row[0]);
      Location start = locations.get(Integer.parseInt(row[1]));
      Time time = new Time(row[2]);
      Location end = locations.get(Integer.parseInt(row[3]));
      map.put(id, new Route(id, start, time, end));
    }
    return map;
  }
}
