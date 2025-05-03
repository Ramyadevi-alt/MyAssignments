package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		int num = 12341;
		int originalNum = num; //store original value --do not change/use original number 
		int reversedNum = 0;
		boolean isPalindrome = true;
		
			//to handle negative numbers 	
		if (num<0) {
					isPalindrome = false;
				}
		else {
			while (num>0) {
				
				int digit = num % 10; // to find last digit of original number-- 5th digit
				reversedNum = reversedNum * 10 + digit; // Enter reversed number --print 1 
				num = num / 10; // Remaining original number ---current number 1232
// repeats until original number> 0
				}
			if (originalNum != reversedNum) {
				isPalindrome = false;
			}
			}
			
		if (isPalindrome) {
			System.out.println(originalNum+" is Palindrome");
			
		} else {
			System.out.println(originalNum+" is not a Palindrome");
		}

	}

}
