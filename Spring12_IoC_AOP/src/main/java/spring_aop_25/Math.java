package spring_aop_25;

import spring_aop_23.IMath;

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
     * 模
     */
    public void mod(int n1, int n2) {
        System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
    }
}
