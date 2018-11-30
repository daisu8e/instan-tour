package instant_tour;

public class Tour {
	private String startPoint;
	private String endPoint;
	
	Review review = new Review();
	Schedule schedule = new Schedule();
	
	public Tour(String startPoint, String endPoint, String x) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		System.out.println("(" + x + ") --------------------------------------------------------------- ");
		System.out.println();
		System.out.println(startPoint + " > " + endPoint);
		System.out.println();
		System.out.println(review.randomStar() + "      " + review.randomReview() + " tourist reviews");
		System.out.println();
	}
	
	public String getStartPoint() {
		return startPoint;
	}
	
	public String getEndPoint() {
		return endPoint;
	}

	public void showTimeBasedSchedule(String time) {
		System.out.println("Schedule for " + startPoint + " > " + endPoint);
		System.out.println();
		
		
		
	}	
}

















