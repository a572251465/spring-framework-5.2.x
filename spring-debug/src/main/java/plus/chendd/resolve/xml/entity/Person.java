package plus.chendd.resolve.xml.entity;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
	public void setAge(int age) {
		System.out.println("setAge");
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
