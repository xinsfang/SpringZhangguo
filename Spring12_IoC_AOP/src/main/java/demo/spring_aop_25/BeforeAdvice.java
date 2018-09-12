package demo.spring_aop_25;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("调用方法" + method.getName() + "之前可以完成的工作");
    }
}

class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("结束方法" + method.getName() + "之前可以完成的工作");
    }
}

class SurroundAdvice<T> implements MethodInterceptor {

    public T GetProxyObject(Object target){
        ProxyFactory factory=new ProxyFactory();

        factory.setTarget(target);
        factory.addAdvice(this);
        return (T) factory.getProxy();
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知前");
        Object result = methodInvocation.proceed();
        System.out.println("环绕通知后");
        return result;
    }
}
