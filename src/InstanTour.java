import instant_tour.TourGuide;
import instant_tour.Tourist;

import java.util.Scanner;

public class InstanTour {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input;

    TourGuide tourGuide = new TourGuide();
    Tourist tourist = new Tourist();

    tourGuide.welcome();
    input = tourist.inputTime();

    tourGuide.showTours();
    input = tourist.selectTour();

    tourGuide.showTours();
    input = tourist.selectOption();

    tourGuide.start();

    tourist.showLocation(0);
    tourist.showLocation(1);
    tourist.showLocation(2);
    tourist.showLocation(3);
    tourist.showLocation(4);

    tourGuide.guide(0);

    tourist.showLocation(5);
    tourist.showLocation(6);
    tourist.showLocation(7);
    tourist.showLocation(8);

    tourGuide.guide(1);

    tourist.showLocation(9);
    tourist.showLocation(10);
    tourist.showLocation(11);
    tourist.showLocation(12);

    tourGuide.guide(2);

    tourist.showLocation(13);
    tourist.showLocation(14);
    tourist.showLocation(15);
    tourist.showLocation(16);

    tourGuide.finish();

    tourGuide.askReview();
    input = tourist.review();

    tourGuide.askRating();
    input = tourist.rate();

    tourGuide.thankYou();
  }
}
