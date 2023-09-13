package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in); 
	System.out.print("Starting Amount?");
	int stAmount = in.nextInt();
	System.out.print("Win Limit?");
	int winLimit = in.nextInt();
	System.out.print("What is the win chance?");
	double winChance = in.nextDouble();
	
	while(stAmount < winLimit && stAmount > 0) {
	    double randomNumber = Math.random();
	    	if (randomNumber > winChance) {
	    		stAmount--;}
	    	else 
	    		stAmount++;
		System.out.println(stAmount);
		
	}
	

	if (stAmount == 0) {
			System.out.println("Ruin");}
	else
			System.out.println("Success");
	
			
			
			

	}
}
