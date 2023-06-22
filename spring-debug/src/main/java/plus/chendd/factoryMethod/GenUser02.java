package plus.chendd.factoryMethod;

public class GenUser02 {
	public User getUser(String name) {
		User user = new User();
		user.setAge(10);
		user.setName(name);
		
		return user;
	}
}
