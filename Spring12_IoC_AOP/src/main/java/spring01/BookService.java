package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookService {
    IBookDao bookDao;
    public BookService(){
        //bookDao=new OracleBookDao();

        //容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bookbean01.xml");
        //从容器中获取名称为bookdao的对象bean
        bookDao=ctx.getBean("bookdao",IBookDao.class);
    }
    /**新增一本书*/
    public void addNewBook(){
        String bookname="《Spring MVC学习指南》";
        bookDao.save(bookname);
    }
}
