import instant_tour.TourGuide;
import instant_tour.Tourist;

public class InstanTour {
  public static void main(String[] args) {

    TourGuide tourGuide = new TourGuide();
    Tourist tourist = new Tourist();

    while (true) {
      int option;

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
      } else if (option == 1) {
        break;
      }
    }

    tourGuide.start();

    while (true) {
      tourist.checkLocation();
      if (tourist.arrivedAtLocation()) tourGuide.guide(tourist.getLocation());
      else if (tourist.arrivedHome()) break;
    }

    tourGuide.finish();

    tourGuide.askReview();
    tourist.review();

    tourGuide.askRating();
    tourist.rate();

    tourGuide.thankYou();
  }
}
