package spring13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ResourceTest {
    @Resource(name = "carB")
    ICarDao dao;

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("bookbean13.xml");
        ResourceTest obj = ctx.getBean(ResourceTest.class);
        //System.out.println(obj.dao);
    }
}

interface ICarDao {
}

@Repository("carA")
class CarDaoA implements ICarDao {
}

@Repository("carB")
class CarDaoB implements ICarDao {
}

/*
@Resource装配顺序
如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常
如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常
如果指定了type，则从上下文中找到类型匹配的唯一bean进行装配，找不到或者找到多个，都会抛出异常
如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配；
*/