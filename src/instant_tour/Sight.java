package instant_tour;
import java.util.*;
public class Sight {
	private String sightName;
	
	public Sight(String sightName){
		this.sightName = sightName;		
	}
	
	
	public Sight randomSight(ArrayList<Sight> arr) {
		Random ran = new Random();
		return arr.get(ran.nextInt(arr.size()));
		
	}
}
