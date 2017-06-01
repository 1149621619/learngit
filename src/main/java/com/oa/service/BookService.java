package com.oa.service;

import com.oa.model.Book;

import java.util.List;

/**
 * Created by SherryWong on 2017/5/31.
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();


}
