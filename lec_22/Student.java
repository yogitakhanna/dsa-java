package lec_22;

public class Student {
	String name = "gumshuda";
	int age = 4;
	
	Student(){
		this.name = name;
		this.age = age;
	}
	public void Intro() {
		System.out.println(this);
		System.out.println("Hi my name is " + name + " age is " + age);
	}
	public void Slaps(Student s) {
		System.out.println(name + " slaps " + s.name);
	}
	public void Slaps(String name) {
		System.out.println(this.name + " slaps " + name);
	}
}