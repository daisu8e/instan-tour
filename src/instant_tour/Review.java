package instant_tour;

import java.util.Random;

public class Review {
	public String randomStar() {
		Random ran = new Random();
		int x = (ran.nextInt(5) + 1);
		String str = "";
		for (int i = 0; i < x; i++)
			str +="* ";
		return str;
			
	}
	
	public int randomReview() {
		Random ran = new Random();
		return (ran.nextInt(200) + 1);
	}
	
}
