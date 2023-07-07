package plus.chendd.construct_cycle;

public class A {
	private B b;
	private String name;
	
	public A() {}
	
	public A(B b) {
		this.b = b;
	}
	
	public B getB() {
		return b;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
