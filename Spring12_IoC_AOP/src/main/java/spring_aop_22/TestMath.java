package spring_aop_22;

public class TestMath {
    public static void main(String[] args) {
        IMath math=new Proxy();
        System.out.println("math class: "+math.getClass().getCanonicalName());

        int n1=999,n2=112;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
    }
}
