package instant_tour;

import instant_tour.tour.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tour {

  private int id;
  private Schedule schedule;
  private List<Review> reviews;

  public Tour(int id, Schedule schedule) {
    this.id = id;
    this.schedule = schedule;
    this.reviews = Review.findByTour(this);
  }

  public String toString() {
    return this.schedule.toString();
  }

  public int getId() {
    return this.id;
  }

  public String getReviewLabel() {
    int totalReview = this.reviews.size();
    double totalRate = 0;
    for (Review review : this.reviews) totalRate += review.getRate();
    double averageRate = totalRate / totalReview;
    String starts = "";
    for (int i = 1; i <= 5; i++) {
      if (i <= averageRate) starts += "* ";
      else starts += "  ";
    }
    return starts + " " + totalReview + " tourist reviews";
  }

  public Schedule getSchedule() {
    return this.schedule;
  }

  public void showSchedule() {
    this.schedule.show();
  }

  public void showSchedule(int point) {
    this.schedule.show(point);
  }

  public void setHome(Home home) {
    this.schedule.addHome(home);
  }

  public List<Location> getRoute() {
    return this.schedule.getRoute();
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
