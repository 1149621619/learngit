package com.oa.service.impl;

import com.oa.dao.BookDao;
import com.oa.model.Book;
import com.oa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by SherryWong on 2017/5/31.
 */
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }
}
