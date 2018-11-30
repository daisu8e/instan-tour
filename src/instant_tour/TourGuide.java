package instant_tour;

import java.util.Scanner;

public class TourGuide {

  private static final Scanner SCANNER = new Scanner(System.in);
  private Tour tour1;
  private Tour tour2;
  private Tour tour3;
  private String time;
  

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

  public void showTours(String time) {
	  this.time = time;
	  System.out.println();
	  System.out.println("OK. Now, we are arranging...");
	  SCANNER.nextLine();
	  
	  if (time.equals("1 day")) {
		  tour1 = new Tour ("Granville Island", "Gastown", "1");
		  tour2 = new Tour ("Granville Island", "Stanley Park", "2");
		  tour3 = new Tour ("Gastown", "Stanley Park", "3");
	  }
	  
	  if (time.equals("2 days")) {
		  tour1 = new Tour ("Granville Island", "Capilano Suspension Bridge", "1");		  
		  tour2 = new Tour ("Gastown", "Capilano Suspension Bridge", "2");
		  tour3 = new Tour ("Stanley Park", "Whistler", "3");
	  }
	  
	  if (time.equals("3 days")) {
		  tour1 = new Tour ("Granville Island", "Whistler", "1");		  
		  tour2 = new Tour ("Gastown", "Whistler", "2");		  
		  tour3 = new Tour ("Stanley Park", "Whistler", "3");
	  }
	  
	  System.out.println("(0) ---------------------------------------------------------------\n");
	  System.out.println("Back \n");
	  System.out.println("-------------------------------------------------------------------\n");
	  System.out.println("Select a number that you are interested in.\n");
	  
  }

  public void showSchedule(String tourNum) {
    for (int i = 0; i < 100; i++) System.out.println("");

    if (tourNum.equals("1")){
    	tour1.showTimeBasedSchedule(time);
    }
    
    if (tourNum.equals("2")) {
    	tour2.showTimeBasedSchedule(time);
    }
    
    if (tourNum.equals("3")) {
    	tour3.showTimeBasedSchedule(time);
    }
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
