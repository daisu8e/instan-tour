package instant_tour;

import java.util.Scanner;

public class TourGuide {

  private static final Scanner SCANNER = new Scanner(System.in);

  public void welcome() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.println("----------------------------------------------------------------");
    System.out.println("InstanTour");
    System.out.println("----------------------------------------------------------------");
    System.out.println("");
    System.out.println("Welcome to InstanTour!");
    System.out.println("");
    System.out.println("We have 5+ sights and 5+ restaurants for your tour.");
    System.out.println("");
    System.out.println("We will instantly arrange some tours for you.");
    System.out.println("");
    System.out.println("How long would you like to tour?");
    System.out.println("");
  }

  public void showTours() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.println("(1) ------------------------------------------------------------");
    System.out.println("");
    System.out.println("Granville Island > Yaletown");
    System.out.println("");
    System.out.println("* * * * *  183 tourist reviews");
    System.out.println("");
    System.out.println("(2) ------------------------------------------------------------");
    System.out.println("");
    System.out.println("Granville Island > Yaletown");
    System.out.println("");
    System.out.println("* * *      73 tourist reviews");
    System.out.println("");
    System.out.println("(3) ------------------------------------------------------------");
    System.out.println("");
    System.out.println("Granville Island > Yaletown");
    System.out.println("");
    System.out.println("*          8 tourist reviews");
    System.out.println("");
    System.out.println("(0) ------------------------------------------------------------");
    System.out.println("");
    System.out.println("Back");
    System.out.println("");
    System.out.println("----------------------------------------------------------------");
    System.out.println("");
    System.out.println("Select a number that you are interested in.");
    System.out.println("");
  }

  public void showTour() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.println("Schedule for Granville Island > Yaletown");
    System.out.println("");
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
    System.out.println("");
    System.out.println("(1) Start this tour!");
    System.out.println("(2) Check reviews");
    System.out.println("(0) Back");
    System.out.println("");
    System.out.println("Select a number that you want to do.");
    System.out.println("");
  }

  public void start() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.print("OK! Here we go!");
    SCANNER.nextLine();
  }

  public void guide(int location) {

    if (location == 0) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("OK. We will guide you around Granville Island.");
      System.out.println("Granville Island is ...");
      System.out.println("...");
      System.out.println("...");
      SCANNER.nextLine();
      return;
    }

    if (location == 1) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("OK. We will guide you around The Sandbar Seafood Restaurant.");
      System.out.println("The Sandbar Seafood Restaurant is ...");
      System.out.println("...");
      System.out.println("...");
      SCANNER.nextLine();
      return;
    }

    if (location == 2) {
      for (int i = 0; i < 100; i++) System.out.println("");
      System.out.println("OK. We will guide you around Yaletown.");
      System.out.println("Yaletown is ...");
      System.out.println("...");
      System.out.println("...");
      SCANNER.nextLine();
      return;
    }
  }

  public void finish() {
    for (int i = 0; i < 100; i++) System.out.println("");
    System.out.println("Hi! How was your tour?");
  }

  public void askReview() {
    System.out.println("");
    System.out.println("Please enter your review.");
    System.out.println("");
  }

  public void askRating() {
    System.out.println("");
    System.out.println("And please enter your stars (* - *****).");
    System.out.println("");
  }

  public void thankYou() {
    System.out.println("");
    System.out.println("Thank you for using InstanTour and we hope you will use it again.");
  }

}
