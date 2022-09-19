package wang.z.service;

import org.springframework.transaction.annotation.Transactional;
import wang.z.domain.Book;

import java.util.List;

@Transactional
public interface BookService {
     /*
     * 保存
     * */
    public boolean save(Book book);
   /*
     * 按id修改
     * */
    public boolean update(Book book);
    /*
     * 按id删除
     * */
    public boolean delete(Integer id);
    public Book getById(Integer id);
    public List<Book> getAll();
}
