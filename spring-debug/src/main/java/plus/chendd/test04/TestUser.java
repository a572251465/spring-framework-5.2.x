package plus.chendd.test04;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class TestUser  extends ApplicationEvent implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public TestUser(Object source) {
		super(source);
	}
}
