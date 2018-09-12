package demo.spring_aop_24;

import java.util.Random;

/**
 * 算术
 */
public class Math {
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

}
