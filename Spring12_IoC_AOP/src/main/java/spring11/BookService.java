package spring11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookService {

    public static void main(String[] args) {
        //容器
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext(new String[]{"bookbean11.xml"});
        //从容器中获得对象
        IBookDao dao1=ctx.getBean("MSBookDao",IBookDao.class);
        IBookDao dao2=ctx.getBean("MSBookDao",IBookDao.class);
        System.out.println(dao1==dao2);
        dao1.add();

    }
}
