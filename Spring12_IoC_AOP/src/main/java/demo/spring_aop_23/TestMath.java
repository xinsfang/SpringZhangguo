package demo.spring_aop_23;

import java.lang.reflect.Proxy;

public class TestMath {
    public static void main(String[] args) {
        DynamicProxy proxy=new DynamicProxy(new Math());
        IMath math= (IMath) Proxy.newProxyInstance(TestMath.class.getClassLoader(),new Class[]{IMath.class},proxy);
        int n1=999,n2=112;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
    }
}
