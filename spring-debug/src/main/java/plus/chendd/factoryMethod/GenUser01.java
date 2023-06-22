package plus.chendd.factoryMethod;

public class GenUser01 {
	public static User getUser(String name) {
		User user = new User();
		user.setAge(10);
		user.setName(name);
		
		return user;
	}
}
