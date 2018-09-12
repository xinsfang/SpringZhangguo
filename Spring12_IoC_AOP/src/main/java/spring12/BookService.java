package spring12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    IBookDao bookDao;

    /**新增一本书*/
    public void addNewBook(){
        String bookname="《Spring MVC学习指南》";
        bookDao.save(bookname);
    }
}
