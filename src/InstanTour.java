import instant_tour.TourGuide;
import instant_tour.Tourist;

public class InstanTour {
  public static void main(String[] args) {

    TourGuide tourGuide = new TourGuide();
    Tourist tourist = new Tourist();

    int option;

    while (true) {

      if (!tourist.hasTime()) {
        tourGuide.welcome();
        tourGuide.askTime();
        tourist.inputTime();
        tourGuide.arrangeTours(tourist);
      }

      if (!tourist.hasTour()) {
        tourGuide.askTour();
        option = tourist.inputOption();
        if (option == 0) {
          tourist.clearTime();
          continue;
        } else {
          tourist.setTour(tourGuide.getTours().get(option - 1));
        }
      }

      tourist.checkTour();
      tourGuide.askStart();
      option = tourist.inputOption();
      if (option == 0) {
        tourist.clearTour();
        continue;
      }

      tourGuide.start();

      tourist.checkLocation(0);
      tourist.checkLocation(1);
      tourist.checkLocation(2);
      tourist.checkLocation(3);
      tourist.checkLocation(4);

      tourGuide.guide(0);

      tourist.checkLocation(5);
      tourist.checkLocation(6);
      tourist.checkLocation(7);
      tourist.checkLocation(8);

      tourGuide.guide(1);

      tourist.checkLocation(9);
      tourist.checkLocation(10);
      tourist.checkLocation(11);
      tourist.checkLocation(12);

      tourGuide.guide(2);

      tourist.checkLocation(13);
      tourist.checkLocation(14);
      tourist.checkLocation(15);
      tourist.checkLocation(16);

      tourGuide.finish();

      tourGuide.askReview();
      tourist.review();

      tourGuide.askRating();
      tourist.rate();

      tourGuide.thankYou();
    }
  }
}
