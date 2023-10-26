import java.util.Scanner;

public class quetion4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define item value in array
		double[] items = {239.99, 129.75, 99.95, 350.89};
		
		//define base salary and commission as constant
		double base_salary = 200;
		double commission_rate = 0.09;
		
		Scanner sc= new Scanner(System.in);
		
		//entering the sales person 
		System.out.println("Enter a sale's name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the number of items sold by " + name + ":");
		int itemSold = sc.nextInt();
		
		//initialise the gross sales and commission variables
		
		double gross_Sales = 0;
		double commission = 0;
		
		//loop of the item sold and their values
		for(int i = 0; i <itemSold; i++) {
			
			//enter item number
			System.out.println("Enter the item number");
			int item_number = sc.nextInt();
			
			if(item_number >= 1 && item_number <=4) {
				
				gross_Sales +=items[item_number-1];
			}
			else {
				System.out.println("Invalid item number");
			}
		}
		
		//commission calculation
		
		commission = gross_Sales *commission_rate;
		
		//calculation of total
		
		double total_Pay = base_salary + commission ;
		
		//display the output
		
		System.out.println("The gross sales of " + name + " is " + gross_Sales);
		System.out.println("The commission of " + name + " is " + commission );
		System.out.println("The total pay of " + name + " is " + total_Pay );
	}

}
