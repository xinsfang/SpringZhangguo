package spring13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class QualifierTest {
    @Autowired
    @Qualifier("daoA")
    IBookDao dao;

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("bookbean13.xml");
        QualifierTest obj = ctx.getBean(QualifierTest.class);
        System.out.println(obj.dao);
    }
}

interface IBookDao {
}

@Repository("daoA")
class BookDaoA implements IBookDao {
}

@Repository("daoB")
class BookDaoB implements IBookDao {
}

/*
@Resource装配顺序
如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常
如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常
如果指定了type，则从上下文中找到类型匹配的唯一bean进行装配，找不到或者找到多个，都会抛出异常
如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配；
*/