package pro1.myjavaprogram;
import pro1.my_2_java_program.Bacics;

import java.util.Scanner;

public class build_a_if_the_user_enter_somethig_it_will_repate_again {
	public static void main(String[] args) {
		// TODO Auto-generate user
		//
		String input = "";
		while (!input.equals("quit")) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input: ");
			input = scanner.nextLine().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (!input.equals("quit"))
				System.out.println(input);
		}
	}

}
