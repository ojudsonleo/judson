package pro1.myjavaprogram;
import java.util.*;
import java.lang.*;
import java.text.*;

import java.awt.*;
//template = description= a_Calculator, Name = 
public class userinterfase {
	
	public static void main(String[] args) {
		
		//TODO: my_user_inte_face
		Scanner sane_a_user = new Scanner(System.in);
		System.out.print("user_inter_fase: ");
		String user_inter_fase =  sane_a_user.nextLine();
		boolean bn1 = true;
		
		Point pt1 = new Point(120,160);
		System.out.print("boolean: " + bn1);
		System.out.println("");
		System.out.print("Key: ");
		String Key =  sane_a_user.nextLine();
		
		
		System.out.println("");
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("Principal: ");
		int principal = scanner.nextInt();
				
		
		System.out.print("Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
				
		System.out.print("Period (Years): ");
		byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
				
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		//$NON-NLS-N$
		System.out.println("getting");
		
		
		switch (user_inter_fase){
			case "ojudsonleo":
				System.out.print("boolean: " + bn1);
				
			case "ojoeljebitto":
				System.out.print("boolean: " + bn1);
				
			case "obedotto":
				System.out.print("boolean: " + bn1);
				
			case "jabajasphin":
				System.out.print("boolean: " + bn1);
		}
	}
}
