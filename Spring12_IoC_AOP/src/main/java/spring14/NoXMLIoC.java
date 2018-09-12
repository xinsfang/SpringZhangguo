package spring14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

public class NoXMLIoC {
    public static void main(String[] args) {
        //基于类型的配置
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppCfg.class);
        ICarDao dao1=ctx.getBean("oracleDao",ICarDao.class);
        dao1.add("Spring Pro Oracle");
        ICarDao dao2=ctx.getBean("mysqlDao",ICarDao.class);
        dao2.add("Spring Pro MySQL");
        System.out.println(dao1==dao2);
    }
}

interface ICarDao{
    void add(String name);
}
@Repository("oracleDao")
class CarDao implements ICarDao{
    public void add(String name) {
        System.out.println("添加"+name+"成功！");
    }
}
@Configuration
@ComponentScan(basePackages = "spring14")
class AppCfg{
    @Bean
    ICarDao mysqlDao(){  //方法名就是bean的name
        return new CarDao();
    }
}