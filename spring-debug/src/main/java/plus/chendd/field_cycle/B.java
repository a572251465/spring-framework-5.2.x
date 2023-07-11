package plus.chendd.field_cycle;

public class B {
	private A a;
	private String name;
	public void setA(A a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "B{" +
				"name='" + name + '\'' +
				'}';
	}
	public A getA() {
		return a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
