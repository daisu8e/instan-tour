package instant_tour;

import java.util.Scanner;

public class Tourist {

  private static final Scanner SCANNER = new Scanner(System.in);

  private Gps gps;
  private Home home;
  private Time time;
  private Tour tour;

  public Tourist() {
    this.gps = new Gps();
    this.home = new Home(this.gps.getLocationName());
  }

  public void inputTime() {
    System.out.print("> You : ");
    this.time = new Time(SCANNER.nextLine());
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

  public void checkLocation(int step) {

    if (step == 0) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println(" -> + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 1) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 2) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 3) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 4) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 5) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 6) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 7) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 8) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 9) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 10) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 11) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 12) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 13) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 14) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 15) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> |");
      System.out.println("    + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }

    if (step == 16) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("    + 10:00 @ Current location");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 10:30 @ Granville Island");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 12:45 @ The Sandbar Seafood Restaurant");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    + 14:00 @ Yaletown");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println("    |");
      System.out.println(" -> + 18:00 @ Current location");
      SCANNER.nextLine();
      return;
    }
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
