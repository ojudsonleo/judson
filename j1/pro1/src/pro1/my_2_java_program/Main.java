package pro1.my_2_java_program;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat joeljebitto = new Cat();
		joeljebitto.speak();
		int y = joeljebitto.getAge();
		
		Lion judsonleo = new Lion("judsonleo", 7);
		judsonleo.Lion_Speak();
		int x = judsonleo.getAge();
		System.out.println("lion is age: " + x);
		System.out.println("Cat is age:" + y);
	}

}
