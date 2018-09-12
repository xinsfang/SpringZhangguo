package demo.spring_aop_23;

import java.util.Random;

/**
 * 算术
 */
public class Math implements IMath {
    /**
     * 加
     */
    public void add(int n1, int n2) {
        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
    }

    /**
     * 减
     */
    public void sub(int n1, int n2) {
        System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
    }

    /**
     * 乘
     */
    public void mul(int n1, int n2) {
        System.out.println(n1 + "X" + n2 + "=" + (n1 * n2));
    }

    /**
     * 除
     */
    public void div(int n1, int n2) {
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
    }

    /**
     * 随机延时
     */
    public void lazy() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
