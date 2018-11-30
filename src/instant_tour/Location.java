package instant_tour;

import instant_tour.location.Repository;

import java.util.HashMap;
import java.util.Map;

public abstract class Location {

  private int id;
  private String name;
  private Time time;
  private String information;

  public Location(String name) {
    this.name = name;
  }

  public Location(int id, String name, Time time, String information) {
    this.id = id;
    this.name = name;
    this.time = time;
    this.information = information;
  }

  public String toString() {
    return this.name;
  }

  public String getName() {
    return this.name;
  }

  public Time getTime() {
    return this.time;
  }

  public String getInformation() {
    return this.information;
  }

  public static Map<Integer, Location> find() {
    Map<Integer, Location> map = new HashMap<>();
    for (String[] row : Repository.data) {
      int id = Integer.parseInt(row[0]);
      String type = row[1];
      String name = row[2];
      Time time = new Time(row[3]);
      String information = row[4];
      switch (type) {
        case "Sight":
          map.put(id, new Sight(id, name, time, information));
          break;
        case "Restaurant":
          map.put(id, new Restaurant(id, name, time, information));
          break;
      }
    }
    return map;
  }
}
