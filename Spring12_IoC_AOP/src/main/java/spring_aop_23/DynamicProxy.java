package spring_aop_23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 目标代理对象
     */
    Object target;

    /**获得被代理后的对象*/
    public Object getProxyObject(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                DynamicProxy.class.getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    /**
     * 调用目标对象的方法
     * 当用户调用对象中的每个方法时都通过下面的方法执行，方法必须在接口
     * proxy 被代理后的对象
     * method 将要被执行的方法信息（反射）
     * args 执行方法时需要的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //当前时间的毫秒
        long span = System.currentTimeMillis();
        lazy();
        Object result = method.invoke(target, args);
        System.out.println("用时：" + (System.currentTimeMillis() - span));
        return result;
    }

    /**延迟*/
    public void lazy() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
