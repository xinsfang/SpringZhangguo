package spring11;

import org.springframework.stereotype.Component;

@Component("bookdao")
public class BookDao implements IBookDao {
    public void add() {
        System.out.println("新增图书成功！");
    }
}
