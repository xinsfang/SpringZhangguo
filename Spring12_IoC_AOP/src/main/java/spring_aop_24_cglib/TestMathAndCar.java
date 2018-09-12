package spring_aop_24_cglib;

public class TestMathAndCar {
    public static void main(String[] args) {
        int n1 = 999, n2 = 112;

        /*IMath imath = (IMath) new CglibProxy().getProxyObject(new Math()); //Cannot be cast to Interface
        System.out.println("imath class: "+imath.getClass().getCanonicalName());

        imath.add(n1, n2);
        imath.sub(n1, n2);
        imath.mul(n1, n2);
        imath.div(n1, n2);*/

        Math math = (Math) new CglibProxy().getProxyObject(new Math());
        System.out.println("\nmath class: "+math.getClass().getCanonicalName());

        math.add(n1, n2);
        math.sub(n1, n2);
        math.mul(n1, n2);
        math.div(n1, n2);
        math.mod(n1, n2); //Not defined in Interface

        Car car= (Car) new CglibProxy().getProxyObject(new Car());
        System.out.println("\ncar class: "+car.getClass().getCanonicalName());

        car.start();
        car.stop();
    }
}
