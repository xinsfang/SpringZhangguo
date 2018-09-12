package spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        //IoC容器
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("bookbean01.xml","beans02.xml");
        //从容器中获取对象
        Person tom=ctx.getBean("tom",Person.class);
        Person roseA=ctx.getBean("rose",Person.class);
        Person roseB=ctx.getBean("rose",Person.class);
        //Address zhuhai=ctx.getBean("zhuhai",Address.class);
        System.out.println(tom);
        System.out.println(roseA==roseB);
        System.gc();
    }
}
