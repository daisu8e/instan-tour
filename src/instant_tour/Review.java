package instant_tour;

import instant_tour.review.Repository;

import java.util.*;


public class Review {

  private int id;
  private int tourId;
  private String comment;
  private double rate;

  public Review(int id, int tourId, String comment, double rate) {
    this.id = id;
    this.tourId = tourId;
    this.comment = comment;
    this.rate = rate;
  }

  public int getTourId() {
    return this.tourId;
  }

  public double getRate() {
    return this.rate;
  }

  public static Map<Integer, Review> find() {
    Map<Integer, Review> map = new HashMap<>();
    for (String[] row : Repository.data) {
      int id = Integer.parseInt(row[0]);
      int tourId = Integer.parseInt(row[1]);
      String comment = row[2];
      double rate = Double.parseDouble(row[3]);
      map.put(id, new Review(id, tourId, comment, rate));
    }
    return map;
  }

  public static List<Review> findByTour(Tour tour) {
    List<Review> list = new ArrayList<>();
    Map<Integer, Review> all = find();
    Set<Integer> keys = all.keySet();
    for (Integer key : keys) {
      Review review = all.get(key);
      if (review.getTourId() == tour.getId()) list.add(review);
    }
    return list;
  }
}
