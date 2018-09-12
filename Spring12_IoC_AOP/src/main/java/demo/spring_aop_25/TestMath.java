package demo.spring_aop_25;

import org.springframework.aop.framework.ProxyFactory;

public class TestMath {
    public static void main(String[] args) {

//        ProxyFactory factory=new ProxyFactory();
//
//        factory.setTarget(new Math());
//        factory.addAdvice(new BeforeAdvice());
//        factory.addAdvice(new AfterAdvice());
//        factory.addAdvice(new SurroundAdvice());
//        Math math= (Math) factory.getProxy();
        Math math= new SurroundAdvice<Math>().GetProxyObject(new Math());
        int n1=999,n2=112;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
    }
}
