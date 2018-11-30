package instant_tour;

import java.util.List;

public class Gps {

  private double latitude;
  private double longitude;
  private List<Location> route;
  private int point = -1;

  public String getName(String name) {
    return name;
  }

  public void setRoute(List<Location> route) {
    this.route = route;
  }

  public Location getLocation () {
    return this.route.get(this.point);
  }

  public int getPoint() {
    return this.point;
  }

  public void nextPoint() {
    this.point++;
  }
}
