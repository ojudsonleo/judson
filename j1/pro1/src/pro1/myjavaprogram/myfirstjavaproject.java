package pro1.myjavaprogram;
import java.util.*;
import java.lang.*;
import java.text.*;
// finshed a video

import java.awt.*;
// video Number = Reading Input
public class myfirstjavaproject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		String Username =  scanner.nextLine().trim();
		System.out.print("Email: ");
		String Email =  scanner.nextLine().trim();
		System.out.print("Password: ");
		String Password =  scanner.nextLine().trim();
		System.out.print("create_a_user_inter_fase: ");
		String create_a_user_inter_fase =  scanner.nextLine().trim();
		System.out.println("Username: " + Username+ "," + " Password: " + Password+ "," + " Email: " + Email+ "," + " Key: " + Username + "user inter fase: " + create_a_user_inter_fase);
		
		System.out.println("                                                          ");
		
		Point point1 = new Point(23, 45);
		
		Point point2 = point1;
		
		point1.x  = 10;
		
		point2.y = 45-10;
		
		String mesage = new String("Java.awt.Point[x=2,y=12]");
		
		System.out.println("Point2: " + point2);
		
		System.out.println("message: " + mesage.replace(mesage, "Java.awt.Point[x=3,y=13]"));
		
		System.out.println("toLowerCase message: " + mesage.toLowerCase());
		System.out.println("                                                                                                                       ");
		int[] numbers = { 
				2,
				3,
				1,
				4
				,6,
				5,
				7
		};
		int mat = (int) (Math.random() * 100);
		
		String result =  NumberFormat.getCurrencyInstance().format(242.423);
		System.out.println("currency: " + result);
		
		
		String result2 =  NumberFormat.getPercentInstance().format(23.23243);
		System.out.println("Percent: " + result2);
		System.out.println("                                                                                                                      ");

		System.out.println("randomNumber:" + mat);
		
		System.out.println("1.Array: " + Arrays.toString(numbers));
		System.out.println("1.length: "+ numbers.length);
		System.out.println("1.hashCode: " + numbers.hashCode());
		System.out.println("1.clone: " + numbers.clone() + "]");
		
		System.out.println("                                         ");
		
		int[][] number = { { 1,12,34,78,45,100,23,1000,123,12 }, { 123,135,190,450,70,904 } };
		System.out.println("2.arrays: " + Arrays.deepToString(number));
		System.out.println("2.length of arrays: " + number.length);
		System.out.println("2.hashCode: " + number.hashCode());
		
		System.out.print("");
		// TODO Auto-generated method stub
		
		//build_a_Calculator
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
				
		Scanner scanner2 = new Scanner(System.in);
				
		System.out.print("Principal: ");
		int principal = scanner2.nextInt();
				
		System.out.print("Annual Interest Rate: ");
		float annualInterest = scanner2.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
				
		System.out.print("Period (Years): ");
		byte years = scanner2.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
				
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
		System.out.print("get (y,n): ");
		Scanner scanner3 = new Scanner(System.in);
		String getornot = scanner.nextLine().trim();
		System.out.print("install y or n: ");
		String yesornot = scanner.nextLine().trim();
		System.out.print("finshed..");
		
		System.out.println("");
		boolean isEligible  = years > 100 && numberOfPayments  > 10;
		System.out.println("if isEligible or not: " + isEligible);
		System.out.println("");

		Scanner myscanner = new Scanner(System.in);
		System.out.print("Number: ");
		int mynumber = myscanner.nextInt();
		// https://github.com/foreignguymike/.git
		if (mynumber % 5 == 0) {
			if (mynumber % 3 == 0)
				System.out.println("FizzBuzz");
			else 
				System.out.println("Fizz");
		}
		else if (mynumber % 3 == 0)
			System.out.println("Buzz");
		else 
			System.out.println("�($1432.2)");
		
		Scanner myscanner2 = new Scanner(System.in);
		System.out.print("Number: ");
		int mynumber2 = myscanner2.nextInt();
		
		if (mynumber2 % 5 == 0) {
			if (mynumber2 % 3 == 0)
				System.out.println("FizzBuzz");
			else 
				System.out.println("Fizz");
		}
		else if (mynumber2 % 3 == 0)
			System.out.println("Buzz");
		else 
			System.out.println("�(Rs." + mynumber2 % 100  + ")");
		
		Scanner myscanner3 = new Scanner(System.in);
		System.out.print("Number: ");
		int mynumber3 = myscanner3.nextInt();
		
		if (mynumber3 % 5 == 0) {
			if (mynumber3 % 3 == 0)
				System.out.println("FizzBuzz");
			else 
				System.out.println("Fizz");
		}
		else if (mynumber3 % 3 == 0)
			System.out.println("Buzz");
		else {
			System.out.println("�($21.4354)");
			int mynumbe = 21;
			switch (mynumbe){
				case 12:
					System.out.print("12");
				case 100:
					System.out.print(140);
			}
		}
	}
}
