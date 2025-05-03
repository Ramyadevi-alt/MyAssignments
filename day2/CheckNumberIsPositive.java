package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int n = -9;
		if (n>=0) {
			System.out.println(n+" is a positive number");	
			// why we couldn't handle break here 
		}
		else {
			System.out.println(n+" is a negative number");
		}
	}

}
