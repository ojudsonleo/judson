package pro1.my_2_java_program;

public class Lion {
	
	private String Lion_Name;
	private int Lion_age;
	
	public Lion(String Lion_Name, int Lion_age) {
		this.Lion_Name = Lion_Name;
		this.Lion_age = Lion_age;
	}
	
	public void Lion_Speak() {
		System.out.println("i am " + this.Lion_Name + " and I am " + this.Lion_age + " years old" + " and i am a Lion i whill eat evry animal");
	}
	
	public int getAge() {
		return this.Lion_age;
	}
	
	public void setAge(int age) {
		this.Lion_age = age;
	}

}
