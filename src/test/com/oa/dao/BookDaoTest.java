package com.oa.dao;

import com.oa.BaseTest;
import com.oa.model.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by SherryWong on 2017/5/31.
 */
public class BookDaoTest extends BaseTest{

    @Autowired
    private BookDao bookDao;

    @Test
    public void queryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void queryAll() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void reduceNumber() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

}