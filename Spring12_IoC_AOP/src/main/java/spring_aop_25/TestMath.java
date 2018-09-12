package spring_aop_25;


import org.springframework.aop.framework.ProxyFactory;

public class TestMath {
    public static void main(String[] args) {

        //代理工厂
        ProxyFactory proxy=new ProxyFactory();
        //添加被代理的对象
        proxy.setTarget(new Math());
        //添加前置通知
        proxy.addAdvice(new BeforeAdvice());
        //添加后置通知
        proxy.addAdvice(new AfterAdvice());
        //添加环绕通知
        proxy.addAdvice(new SurroundAdvice());
        //获得代理后的对象
        Math math= (Math) proxy.getProxy();

        int n1 = 999, n2 = 112;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mul(n1, n2);
        math.div(n1, n2);
        math.mod(n1, n2);
    }
}
