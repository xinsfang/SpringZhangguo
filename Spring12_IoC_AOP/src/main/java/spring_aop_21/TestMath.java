package spring_aop_21;

public class TestMath {
    public static void main(String[] args) {
        Math math=new Math();
        int n1=98,n2=3;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
    }
}
