package spring_aop_21;

import java.util.Random;

/**
 * 算术
 */
public class Math {
    /**
     * 加
     */
    public void add(int n1, int n2) {
        //当前时间的毫秒
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        System.out.println("用时：" + (System.currentTimeMillis() - span));
    }

    /**
     * 减
     */
    public void sub(int n1, int n2) {
        //当前时间的毫秒
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
        System.out.println("用时：" + (System.currentTimeMillis() - span));
    }

    /**
     * 乘
     */
    public void mul(int n1, int n2) {
        //当前时间的毫秒
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1 + "X" + n2 + "=" + (n1 * n2));
        System.out.println("用时：" + (System.currentTimeMillis() - span));
    }

    /**
     * 除
     */
    public void div(int n1, int n2) {
        //当前时间的毫秒
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
        System.out.println("用时：" + (System.currentTimeMillis() - span));
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
