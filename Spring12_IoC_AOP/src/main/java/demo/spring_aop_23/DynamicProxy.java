package demo.spring_aop_23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    Object target;
    public DynamicProxy(Object target) {
        this.target=target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");
        Object result=method.invoke(target,args);
        System.out.println("end");
        return result;
    }
}
