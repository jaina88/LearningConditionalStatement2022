package Com.facebook.qa.ifelseifstatement;

public class IFElseIFStatement {

	public static void main(String[] args) {
		
		int weight = 93;
		int height = 6;
		
		//find the appilcants eligible to join soccer team
		//applicant must be minimum 90 pounds 7 minimum 5.10ft
		// reject
		
		if (weight >= 90 && weight<=95){
		System.out.println("eligible weight");
		}
		else if(height >= 5 && height <= 7) {
		System.out.println("Eligible height");
		}
		else {
			System.out.println("you are not eligible");
		}
		
		
	    
		

	}
}
