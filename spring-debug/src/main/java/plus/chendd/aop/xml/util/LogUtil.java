package plus.chendd.aop.xml.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

public class LogUtil {
	
    public void myPointCut(){}
	
    public void myPointCut1(){}
	
    private int start(JoinPoint joinPoint){
		System.out.println("执行了before方法...");
        return 100;
    }
	
    public static void stop(JoinPoint joinPoint,Object result){
        System.out.println("执行了after returning方法...，结果是："+result);
    }
	
    public static void logException(JoinPoint joinPoint,Exception e){
		System.out.println("执行了after-throwing方法...");
    }
	
    public static void logFinally(JoinPoint joinPoint){
		System.out.println("执行了after方法...");
    }
	
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
		System.out.println("执行了around方法.之前..");
		Object result = pjp.proceed(args);
		System.out.println("执行了around方法.之后..");
		return result;
    }
}
