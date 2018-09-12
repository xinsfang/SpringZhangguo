package spring01;

/**使用MySql完成图书访问*/
public class MySQLBookDao implements IBookDao {
    public void save(String name) {
        System.out.println("添加图书"+name+"到MySQL数据库成功！");
    }
}
