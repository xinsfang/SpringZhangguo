package spring01;

/**
 * 使用Oracle完成图书访问
 */
public class OracleBookDao implements IBookDao {
    public void save(String name) {
        System.out.println("添加图书" + name + "到Oracle数据库成功！");
    }
}
