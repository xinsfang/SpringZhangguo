package spring12;

import org.springframework.stereotype.Repository;

/**
 * 完成图书数据访问
 */
@Repository
public class BookDao implements IBookDao {
    public void save(String name) {
        System.out.println("添加图书" + name + "到数据库成功！");
    }
}
