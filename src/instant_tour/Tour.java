package instant_tour;

import instant_tour.tour.Repository;

import java.util.HashMap;
import java.util.Map;

public class Tour {

  private int id;
  private Schedule schedule;
  private String review;

  public Tour(int id, Schedule schedule) {
    this.id = id;
    this.schedule = schedule;
  }

  public String toString() {
    return this.schedule.toString();
  }

  public String getReview() {
    return this.review;
  }

  public Schedule getSchedule() {
    return this.schedule;
  }

  public void showSchedule() {
    System.out.println("  + 10:00 @ Current location");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  + 10:30 @ Granville Island");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  + 14:00 @ Yaletown");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  |");
    System.out.println("  + 18:00 @ Current location");
  }

  public static Map<Integer, Tour> find() {
    Map<Integer, Tour> map = new HashMap<>();
    Map<Integer, Schedule> schedules = Schedule.find();
    for (String[] row : Repository.data) {
      int id = Integer.parseInt(row[0]);
      map.put(id, new Tour(id, schedules.get(Integer.parseInt(row[1]))));
    }
    return map;
  }
}
