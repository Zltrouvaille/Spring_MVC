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
    public boolean save(@RequestBody Book book) {return bookDao.save(book);}
    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookDao.update(book);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
       return bookDao.delete(id);
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {return bookDao.getById(id); }
    @GetMapping
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
