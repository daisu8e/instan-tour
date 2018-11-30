package instant_tour;

import java.util.Scanner;

public class Tourist {

  private static final Scanner SCANNER = new Scanner(System.in);

  private Gps gps;
  private Home home;
  private Location location;
  private Time time;
  private Tour tour;
  private boolean started = false;

  public Tourist() {
    this.gps = new Gps();
    this.home = new Home(this.gps.getName("CICCC"));
  }

  public Home getHome() {
    return this.home;
  }

  public void inputTime() {
    System.out.print("> You : ");
    this.time = new Time(SCANNER.nextLine() + " days");
  }

  public Time getTime() {
    return this.time;
  }

  public boolean hasTime() {
    return this.time != null;
  }

  public void clearTime() {
    this.time = null;
  }

  public int inputOption() {
    System.out.print("> You : ");
    return Integer.parseInt(SCANNER.nextLine());
  }

  public Tour getTour() {
    return this.tour;
  }

  public void setTour(Tour tour) {
    this.tour = tour;
    this.gps.setRoute(this.tour.getRoute());
  }

  public boolean hasTour() {
    return this.tour != null;
  }

  public void clearTour() {
    this.tour = null;
  }

  public void checkTour() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.println("Schedule for " + this.tour);
    System.out.println("");
    this.tour.showSchedule();
  }

  public void checkLocation() {
    this.gps.nextPoint();
    if (!this.started) this.started = true;
    else this.location = this.gps.getLocation();

    for (int i = 0; i < 100; i++) System.out.println("");
    this.tour.showSchedule(this.gps.getPoint());
    SCANNER.nextLine();
  }

  public boolean arrivedAtLocation() {
    if (this.location == null) return false;
    if (this.location instanceof Home) return false;
    if (this.location == this.gps.getLocation()) return true;
    return false;
  }

  public boolean arrivedHome() {
    if (this.location instanceof Home) return true;
    return false;
  }

  public Location getLocation() {
    return this.location;
  }

  public String review() {
    System.out.print("> You : ");
    return SCANNER.nextLine();
  }

  public String rate() {
    System.out.print("> You : ");
    return SCANNER.nextLine();
  }

}
