package plus.chendd.testAop;

public class AspectBean {
	public void before() {
		System.out.println("AspectBean.before");
	}
	
	public void after() {
		System.out.println("AspectBean.after");
	}
	
	public void afterReturning() {
		System.out.println("AspectBean.afterReturning");
	}
	
	public void afterThrowing() {
		System.out.println("AspectBean.afterThrowing");
	}
	
	public void around() {
		System.out.println("AspectBean.around");
	}
}
