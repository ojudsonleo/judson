package pro1.my_2_java_program;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

import java.lang.*;
import java.text.*;
import java.time.temporal.JulianFields;
import java.awt.*;
// video time = 8:31

public class Bacics {
	
	
	public static void main(String[] args) {
		// TODO Auto-generate java
		//1
		// printStatement();
		//2
		// Variables_and_DataTypes(12, 2.0, false, 'J', "ojudsonleo");
		//3
		// Basic_Operators(21, 70);
		//4
		//Input_and_Scanners();
		//5
		//Conditions_and_Booleans(7, true, "ojudsonleo", 'J');
		//6
		//If_Else_Else_If("Java", 12);
		//7
		//Nested_Statements();
		//8
		//Arrays();
		//9
		//For_Loops();
		//10
		//For_Loops_Continued();
		//11
		//While_Loops();
		//12
		//Sets_and_Lists();
		//13
		//HashMaps();
	}
	
	public static void HashMaps() {
		Map m = new HashMap();
		
		m.put("JudsonLeo", 7);
		m.put("ojoeljebitto", 11);
		
		m.containsValue("JudsonLeo");
		m.containsKey(7);
		
		
		//System.out.println(m.get("ojoeljebitto"));
		System.out.println("storage: " + m);
		System.out.println("values: " + m.values());
		System.out.println("is empty or not: " + m.isEmpty());
		System.out.println("size: " + m.size());
		
		m.put("", 0);
		
//		Map m = new TreeMap();
//		
//		m.put("JudsonLeo", "ojoeljebitto");
//		
//		System.out.println(m);
		
//		Map m = new LinkedHashMap();
//		
//		m.put("JudsonLeo", "ojoeljebitto");
//		
//		System.out.println(m);
	}
	
	public static void Arrays(){
		String[] name = new String[5];
		name[0] = "ojudsonleo";
		name[1] = "ojoeljebitto";
		name[2] = "E.T.jabajasphin";
		name[3] = "obedotto";
		String y = name[3];
		String x = name[2];
		String z = name[1];
		String Y = name[0];
		System.out.println("names[");
		System.out.println("      "+ y);
		System.out.println("      "+ x);
		System.out.println("      "+ z);
		System.out.println("      "+ Y);
		System.out.println("]");
		
		int[] number = {0, 1, 2, 3};
		
		int nums = number[0];
		int num = number[1];
		int nu = number[2];
		int n = number[3];
		
		System.out.println("their numbers[");
		System.out.println("       " + nums);
		System.out.println("       "+ num);
		System.out.println("       "+ nu);
		System.out.println("       "+ n);
		System.out.println("]");
		
		double[] Double = {0.0, 1.1, 2.2, 3.3};
		
		int Doubl = number[0];
		int Doub = number[1];
		int Do = number[2];
		int D = number[3];
		
		System.out.println("their numbers in double[");
		System.out.println("       " + Doubl);
		System.out.println("       "+ Doub);
		System.out.println("       "+ Do);
		System.out.println("       "+ D);
		System.out.println("]");
		
	} 
	
	// For Loops
	public static void For_Loops() {
		int[] arr = {1,5,7,3,4,5};
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == 5) {
				System.out.println("Found a 5! at index " + i);
			}
		}
	}
	
	//While Loops
	@SuppressWarnings("unused")
	public static void While_Loops() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		while (x<=10) {
			x += 1;
		}
		 
	}
	
	// TODO: time: 1:52 / 15:11
	public static  void Sets_and_Lists() {
//		Set<Integer> t = new LinkedHashSet<Integer>();
//		t.add(5);
//		t.add(3);
//		t.add(4);
//		t.add(2);
//		t.add(1);
//		
//		
//		boolean x = t.contains(1);
//		
//		boolean y = t.contains(2);
//		
//		boolean z = t.contains(3);
//		
//		boolean X = t.contains(4);
//		
//		boolean Y = t.contains(5);
//		
//		int SIZE = t.size();
//		
//		boolean isempty = t.isEmpty();
		
		LinkedList<Integer> name = new LinkedList<Integer>();
		name.add(1);
		name.add(2);
		name.get(0);
		name.set(1, 5);
		
		System.out.println(name);
		
//		System.out.println("size: " + SIZE);
//		System.out.println("isemptyornot: " + isempty);
//		System.out.println("storage: " + t);
	}
	
	private static void  For_Loops_Continued() {
		int[] arr = {1,5,7,3,4,5};
		String[] names = new String[4];
		Scanner sc  = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for (String n: names){
			System.out.println(n);
			
			if (n.equals("ojudsonleo")){
				break;
			}
			
			if (n.equals("ojoeljebitto")){
				break;
			}
			
			if (n.equals("E.T.jabajasphin")){
				break;
			}
			
			if (n.equals("obedotto")){
				break;
			}
		}
		
	}
	
	public static void Nested_Statements(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Key: ");
		String s = sc.next();
		
		if (s.equals("Java")){
			Scanner sca = new Scanner(System.in);
			System.out.print("temp: ");
			int scaa = sca.nextInt();
			System.out.println();
			boolean temp = scaa > 10;
			System.out.println(temp);
		}
			switch (s){
			case "java":
				Scanner sca = new Scanner(System.in);
				System.out.print("temp: ");
				int scaa = sca.nextInt();
				System.out.println();
				boolean temp = scaa > 10;
				System.out.println(temp);
			case "J":
				Scanner scan = new Scanner(System.in);
				System.out.print("temp: ");
				int scaan = scan.nextInt();
				System.out.println();
				boolean tem = scaan > 10;
				System.out.println(tem);
				
				
		}
			if(s.equals("Name")){
				Scanner scan = new Scanner(System.in);
				System.out.print("temp: ");
				int scaan = scan.nextInt();
				System.out.println();
				boolean tem = scaan > 10;
				System.out.println(tem);
			}
	}
	
	// 2
	private static void Variables_and_DataTypes(int age, double d, boolean true_or_false, char key, String name) {
		// TODO Auto-generated method stub
		int Intenger = 7;
		float Float = 7.0F;
		boolean Boolean = true;
		char Char = 'J';
		String string = "judsonleo";
		//if you are want to print 
		// System.out.println("name: " + string + " Key: " + Char +" yes or no: " + Boolean + " age: " + Float + " age i Intenger: " + Intenger);
	}
	// 1
	public static void printStatement(){
		System.out.println("");
	}
	// 3
	public static void Basic_Operators(int y2, int x2){
		
		Scanner scane = new Scanner(System.in);
		int x = 100;
		int y = 800;
		int z = 900;
		double sum = (50 * 3 * 4 *  y + z *(2000000000*(90000000+(6007)+(5000))))/z;
		
		double d = Math.pow(x, y);
		
		System.out.print("ended by 0: ");
		int ended = scane.nextInt();
		System.out.print("ended by 0: ");
		int ende = scane.nextInt();
		System.out.print("ended by 0: ");
		int end = scane.nextInt();
		System.out.println("[args.get(hashcode)] = x.sum([" + "number: " + d +" locked: "+ sum + "])");
	}
	
	//4
	public static void Input_and_Scanners(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String scanned = sc.next();
		
		int x = Integer.parseInt(scanned);
		
		
		System.out.println(scanned);
	}
	
	public static void  Conditions_and_Booleans(int age, boolean b, String Name, char Key){
		int x = 6;
		int y = 23;
		int z = 10;
		
		boolean compare = (x < y && y > z) || (z + 2 ==  5 || x + 7 > y);
		
		System.out.println(compare);
	}
	
	public static void If_Else_Else_If(String Key, int tempuare){
		Scanner sc = new Scanner(System.in);
		System.out.print("Key: ");
		String s = sc.next();
		
		if (s.equals("Java")){
			Scanner sca = new Scanner(System.in);
			System.out.print("temp: ");
			int scaa = sca.nextInt();
			System.out.println();
			boolean temp = scaa > 10;
			System.out.println(temp);
		}
			switch (s){
			case "java":
				Scanner sca = new Scanner(System.in);
				System.out.print("temp: ");
				int scaa = sca.nextInt();
				System.out.println();
				boolean temp = scaa > 10;
				System.out.println(temp);
			case "J":
				Scanner scan = new Scanner(System.in);
				System.out.print("temp: ");
				int scaan = scan.nextInt();
				System.out.println();
				boolean tem = scaan > 10;
				System.out.println(tem);
				
				
		}
			if(s.equals("Name")){
				Scanner scan = new Scanner(System.in);
				System.out.print("temp: ");
				int scaan = scan.nextInt();
				System.out.println();
				boolean tem = scaan > 10;
				System.out.println(tem);
			}
			
			
		}
		
	}
