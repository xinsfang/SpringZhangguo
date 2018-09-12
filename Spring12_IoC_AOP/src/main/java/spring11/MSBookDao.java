package spring11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service
@Controller
@Repository  //未指定名称
@Scope("prototype")
public class MSBookDao implements IBookDao {
    public void add() {
        System.out.println("新增图书到SQLServer成功！");
    }
}

