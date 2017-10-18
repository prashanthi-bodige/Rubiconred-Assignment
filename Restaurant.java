package File;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Restaurant {
	
	Scanner in = new Scanner(System.in);

	public void payment() {
		
		
		System.out.println("\nPlease select the mode of payment");
		System.out.println("1)Card \n2)Cash\n");
		System.out.print("Selection: ");
		switch (in.nextInt()) {
		case 1:
			System.out.println("\n**PAYMENT RECEIVED** \n");
		case 2:
			System.out.println("\n**PAYMENT RECEIVED** \n");
			System.out.println("\nThank you for visiting. Please come again!! \n");
		}
	}

	public void choice() {
		
		//Scanner in = new Scanner(System.in);
		System.out.println("Please select an option from below\n");
		System.out.println("1)Order more food \n2)Request Bill\n");
		switch (in.nextInt()) {
		case 1:
			starters();
		case 2:

			Random rand = new Random();

			int n = rand.nextInt(50) + 20;

			System.out.println("The Bill is Rs." + n);

		}
	}

	public void tableSelection() {
		
		//Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Paradise Restaurant\n");
		System.out.println("Please select an option for seating\n");
		System.out.println("1)table \n2)booth \n");
		System.out.print("Selection: ");
		switch (in.nextInt()) {
		case 1:
			System.out.println("\nYou have selected table\n");
			System.out.println("Please be seated \n");
			break;
		case 2:
			System.out.println("\nYou have selected booth\n");
			System.out.println("Please be seated \n");
			break;
		}
	}

	public void starters() {
		
		//Scanner in = new Scanner(System.in);
		System.out.println("Please select a starter option from below");
		System.out.println("1)Manchurian \n2)Chilli chicken \n3)Tandoori chicken \n");
		System.out.print("Selection: ");
		switch (in.nextInt()) {
		case 1:
			System.out.println("\nYou have selected Manchurian \n");
			break;
		case 2:
			System.out.println("\nYou have selected Chilli chicken \n");
			break;
		case 3:
			System.out.println("\nYou have selected Tandoori chicken \n");
			break;
		default:
			System.err.println("\nPlease select a valid option \n");
			break;
		}
	}

	public void mainCourse() {
		//@SuppressWarnings("resource")
		//Scanner in = new Scanner(System.in);
		System.out.println("Please select a main course option from below");
		System.out.println("1)Veg Pulav \n2)Chicken Biryani \n3)Egg Biryani \n");
		System.out.print("Selection: ");
		switch (in.nextInt()) {
		case 1:
			System.out.println("\nYou have selected Veg Pulav \n");
			break;
		case 2:
			System.out.println("\nYou have selected Chicken Biryani \n");
			break;
		case 3:
			System.out.println("\nYou have selected Egg Biryani \n");
			break;
		default:
			System.err.println("\nPlease select a valid option \n");
			break;
		}
	}

	public void desserts() {
//		@SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
		System.out.println("Please select a dessert option from below");
		System.out.println("1)Waffle \n2)Custard \n3)Brownie \n");
		System.out.print("Selection: ");
		switch (in.nextInt()) {
		case 1:
			System.out.println("\nYou have selected Waffle \n");
			break;
		case 2:
			System.out.println("\nYou have selected Custard \n");
			break;
		case 3:
			System.out.println("\nYou have selected Brownie \n");
			break;
		default:
			System.err.println("\nPlease select a valid option \n");
			break;
		}
	}

	public void notice() throws InterruptedException {
		System.out.println("\nOrder is placed \n");
		System.out.println("Please wait while food is being prepared \n");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("***ORDER IS READY. ENJOY THE FOOD***\n");
	}

}
