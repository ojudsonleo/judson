package pro1.my_2_java_program;

import java.util.Scanner;

public class Introduction_to_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//sc.next();
		
		String h = "hello";
		h.length();
		System.out.println(str("hello"));
	}
	
	public static void Data(String str, int how_many_time_it_shoud_print, boolean TrueorFalse, double Double, float Float) {
		for (int i = 0; i < how_many_time_it_shoud_print; i++){
			System.out.println(" str stroage: " + str + "\n integer storage: " + how_many_time_it_shoud_print + "\n Boolean storage: " + TrueorFalse + "\n Double storage: " + Double + "\n Float storage: " + Float);
		}
	}
	
	public static String print(String strData, int integerData) {
		return " str Data: " + strData + "\n integer Data: " + integerData;
	}
	
	public static int add2(int x) {
		return x + 2;
	}
	
	public static String str(String x) {
		return x + "!";
	}

}
