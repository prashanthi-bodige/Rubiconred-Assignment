package com;

import java.util.Scanner;

public class Restaurant {
	
	public static void main(String[] args) {
		System.out.print ( "Menu : \n" );
		System.out.println ( "1) Non Veg \n2) Veg 2\n3) Chinese" );
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the option you want to eat : ");
		int option = sc.nextInt();

	    switch ( option ) {
		 		
		case 1 : System.out.println("1. chicken biryani");
		         System.out.println("2. chicken 65");		         
		         System.out.println("enter the option :");
		         int a=sc.nextInt();
		         switch(a){		         
		         case 1 : System.out.println("1. single -100 rs\n2. Double-200rs \n3. family pack -300r");
		         break;
		         default : System.out.println(" wrong option");
		         break;		         		         
		         }
		   break;
		case 2 : System.out.println("1. veg biryani");
		         System.out.println("2. veg curry");
		  break;
		case 3 :System.out.println(" 1. manchuriya");
		        System.out.println(" 2. noodles");
		default :
			System.out.println("There is no option");
			break;
		  }

		} 
       
	}


