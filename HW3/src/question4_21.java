import java.util.Scanner;

public class question4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
		
		//initialise the count and largest to be zero
		int counter = 0;
		int largest = 0;
		
		//while loop helps to find largest of entered number
		while(counter <10) {
			System.out.println("Please enter an integer");
			
			int number = scann.nextInt();
			if(number >largest) {
				largest = number;
			}
			counter ++;
		}
		
		System.out.println("The largest integer you entered is :" + largest);
		scann.close();
		
	}

}
