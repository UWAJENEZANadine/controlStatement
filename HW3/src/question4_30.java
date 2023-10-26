import java.util.Scanner;

public class question4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//while loop running indefinitely it always keep to be true for that inside conditions
		while(true) {
			System.out.println("please Enter a five digit integer");
			
			
			int num =sc.nextInt();
			
			//calling a function
			if(isFiveDigit(num)) {
				if(isPalindrome(num)) {
					System.out.println("The number is palindrome");
					
				}else {
					System.out.println("The number is not palindrome");
					
				}
				
				break;
			}
			else {
				
				System.out.println("please you must enter a five digit");
			}
				
				
			}
		sc.close();
		}
	
	
	//function for checking if entered number has five digit
	public static boolean isFiveDigit(int num) {
		return num >=10000 && num <= 99999;
	}
	//function for finding a palindrome
	public static boolean isPalindrome(int num) {
		int oringinalNumber = num;
		int reverseNumber = 0;
		
		while(num > 0) {
			int remainder = num % 10;
			reverseNumber = reverseNumber *10 + remainder;
			num /=10;
		}
		return oringinalNumber  == reverseNumber;
	}
	

}
