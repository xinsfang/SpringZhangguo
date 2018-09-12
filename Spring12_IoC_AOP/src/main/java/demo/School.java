package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        //IoC容器
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("demo.xml");
        //从容器中获取对象
        Person tom=ctx.getBean("student", Person.class);
        System.out.println(tom);
    }
}
