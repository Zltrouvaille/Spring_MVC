package wang.z.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wang.z.domain.Book;
import wang.z.service.BookService;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookDao;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag =  bookDao.save(book);
        return new Result(flag ?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @PutMapping
    public  Result  update(@RequestBody Book book) {
        boolean flag =  bookDao.update(book);
        return new Result(flag ?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  bookDao.delete(id);
        return new Result(flag ?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookDao.getById(id);
        Integer code = book != null ? Code.GET_OK:Code.GET_ERR;
        String msg = book != null ? "" : "失败";
        return  new Result(code,book,msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> all = bookDao.getAll();
        Integer code = all != null ? Code.GET_OK:Code.GET_ERR;
        String msg = all != null ? "" : "失败";
        return  new Result(code,all,msg);
    }
}
