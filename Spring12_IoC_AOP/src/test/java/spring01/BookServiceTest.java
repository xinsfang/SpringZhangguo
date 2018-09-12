package spring01;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {

    BookService service=new BookService();

    @Test
    public void addNewBook() throws Exception {
        service.addNewBook();
    }

}