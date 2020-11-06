package pro1.my_2_java_program;
// 12:50 / 14:18

public class Cat extends Dog {
	private int food;
	
	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	
	public Cat(String name) {
		super(name, 11);
	}
	
	public Cat() {
		super("name is undefind", 11);
	}
	
	public void speak() {
		System.out.println("Meow my name is " + this.name + " and i get fed " + this.food);
	}
	
	public void eat(int x) {
		this.food -= x;
	}
	
}
