import instant_tour.*;
import java.util.*;
public class InstanTour {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 
    
	System.out.println("Welcome to InstanTour! \n \n" +
	"We have 5+ sights and 5+ restaurants for your tour. \n \n" +
	"We will instantly arrange some tours for you. \n \n" +
    "How long would you like to tour? \n");
    
    System.out.print(">You: "); String days = input.nextLine();  // user inputs the number of days
    System.out.println();
    System.out.println("OK. Now we are arranging...");
    
    // Set the List of Sights
    Sight sight1 = new Sight("Granville Island");
    Sight sight2 = new Sight("Gastown");
    Sight sight3 = new Sight("Capilano Suspension Bridge");
    Sight sight4 = new Sight("Stanley Park");
    Sight sight5 = new Sight("Whistler Olympic Plaza");
    
    //Create Hashmap with sights' names as Keys and their descriptions as Values
    HashMap<Sight, String> sightMap = new HashMap<Sight, String>();
    sightMap.put(sight1, "Granville Island is a peninsula and shopping district in Vancouver, British Columbia, \n"+
    					 "Canada. It is located across False Creek from Downtown Vancouver under the south \n"+
    					 "end of the Granville Street Bridge.");
    
    sightMap.put(sight2, "Lively Gastown is known for its whistling Steam Clock and mix of souvenir shops, indie art \n"+
    					 "galleries and decor stores in Victorian buildings. A trendy food and drink scene includes chic \n"+
    					 "cocktail lounges and restaurants serving everything from gourmet sandwiches to local \n"+
    					 "seafood. Hip eateries also dot the neighboring Downtown Eastside area, while the up-and \n"+
    					 "coming Railtown district is home to edgy fashion studios.");
    
    sightMap.put(sight3, "");
    
    sightMap.put(sight4, "The park has some beautiful gardens as well as monuments and sculptures. There \n"+
    					 "are totem poles from the First Nations cultures and a place where street artists will \n"+
    					 "paint your portrait. See the Hollow Tree, a 700-800 year old Western Red Cedar with \n"+
    					 "an opening in the huge trunk. Beaver Lake is a wetland area within the park where \n"+
    					 "you can see birds and other wildlife. From Prospect Point there are views over the \n"+
    					 "Lions Gate Bridge. Lost Lagoon is the park’s largest water mass. Follow the Seawall \n"+
    					 "path along the edge of the water for 28km from the Vancouver Convention Center to \n"+
    					 "the Spanish Banks Park. Activities and facilities in the park include pitch and putt \n"+
    					 "golf, the kid’s free summer fun center, tennis courts, water park (1 June-1 Sept), the \n"+
    					 "beach and Second Beach Pool. There is a Miniature Train which takes you \n"+
    					 "throughout the park. \n"+
    					 "\n"+
    					 "Some of the park eateries overlook the sea and other have views of the forest. There \n"+
    					 "is the Tea House, The Fish House, Prospect Point Café, Stanley Park Pavilion and \n"+
    					 "the Waterfall Café serve food and there are food carts at 15 sites. \n"+
    					 "\n"+
    					 "One of the best ways to see Stanley Park is on foot or bike. Take the Stanley Park Bike Tour \n"+
    					 "an enjoyable time is guaranteed.");
    
    sightMap.put(sight5, "Whistler is a town north of Vancouver, British Columbia, that's home to Whistler Blackcomb, \n"+
    					 "one of the largest ski resorts in North America. Besides skiing and snowboarding, the area \n"+
    					 "offers snowshoeing, tobogganing and ski jumping at the Olympic Park, a venue for the 2010 \n"+
    					 "Vancouver Winter Olympics. The hub of Whistler is a compact, chalet-style pedestrian \n"+
    					 "village at the base of Whistler and Blackcomb mountains");
    
    //Create an Arraylist containing the sight options for 1 day plan
    ArrayList<Sight> sightArr = new ArrayList<Sight>();
    sightArr.add(sight1);
    sightArr.add(sight2);
    sightArr.add(sight3);
    sightArr.add(sight4);
    sightArr.add(sight5);
    
    
    // Set the list of restaurant
    Restaurant res1 = new Restaurant("Dockside Restaurant");
    Restaurant res2 = new Restaurant("The Old Spaghetti Factory");
    Restaurant res3 = new Restaurant("Cliff House Restaurant");
    Restaurant res4 = new Restaurant("The Teahouse in Stanley Park");
    Restaurant res5 = new Restaurant("Red Door Bistro Restaurant");
       
    
    //Create an Arraylist containing the restaurants for 1 day plan
    ArrayList<Restaurant> resArr = new ArrayList<Restaurant>();
    resArr.add(res1);
    resArr.add(res2);
    resArr.add(res3);
    resArr.add(res4);
    resArr.add(res5);
    
    //Create Hashmap with restaurants' names as Keys and their descriptions as Values
    HashMap<Restaurant, String> resMap = new HashMap<Restaurant, String>();
    
    while (days.equals("1 day")) {
    	System.out.print("(1)  ");
    	Sight place = new Sight((sight3.randomSight(sightArr)).toString());
    	System.out.println(place.toString());
    	break;
    	
    }
        
  }
}
