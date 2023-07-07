package plus.chendd.testBean.entity;

/**
 * @author Lenovo
 */
public class Man {
	private String sex;
	
	public Man(String sex) {
		this.sex = sex;
	}
	
	public Man() {
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Man{" +
				"sex='" + sex + '\'' +
				'}';
	}
}
