package plus.chendd.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Calculator getProxy(final Calculator calculator){
		// 拿到解析类的loader
        ClassLoader loader = calculator.getClass().getClassLoader();
		// 拿到所有的接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    result = method.invoke(calculator, args);
                } catch (Exception e) {
                } finally {
                }
                return result;
            }
        };
		// 执行逻辑的核心方法
        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (Calculator) proxy;
    }
}