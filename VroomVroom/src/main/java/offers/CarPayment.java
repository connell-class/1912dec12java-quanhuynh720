package offers;

import java.text.NumberFormat;
import java.util.Scanner;

public class CarPayment {
	
	public static Scanner scan = new Scanner(System.in);
	
	public double calculateCarPayment() {
	    System.out.print("Principal: ");
	    int principal = scan.nextInt();

	    System.out.print("Annual Interest Rate: ");
	    float annualInterest = scan.nextFloat();
	    float monthlyInterest = annualInterest / 100 / 12;

	    System.out.print("Number of Payments (Months): ");
	    byte payments = scan.nextByte();

	    double carPayment = (principal * monthlyInterest) / (1 - (Math.pow(1 + monthlyInterest, payments)));

	    String carPaymentFormatted = NumberFormat.getCurrencyInstance().format(carPayment);
	    System.out.println("Monthly Car Payment: " + carPaymentFormatted);
	    
		return carPayment;

	}	
}
