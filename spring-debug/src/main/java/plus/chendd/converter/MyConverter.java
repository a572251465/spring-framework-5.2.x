package plus.chendd.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class MyConverter implements ConverterFactory<User, Person> {
	@Override
	public <T extends Person> Converter<User, T> getConverter(Class<T> targetType) {
//		if (targetType == null) return null;
//		String simpleName = targetType.getSimpleName();
//		if (!"User".equals(simpleName)) return null;
//
//		return new Converter<User, T>() {
//			@Override
//			public T convert(User source) {
//				Person person = new Person();
//				person.setName(source.getName());
//				person.setAddress(source.getProvince() + " " + source.getCity());
//				return (T) person;
//			}
//		};
		return null;
	}
}
