package com.whmc.service;

import com.whmc.dao.BookMapper;
import com.whmc.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: ASSHEAD
 * @Date: 2021/7/5 16:31
 * @Description:
 */
public class BookServiceImpl implements BookService {
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {

        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {

        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {

        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {

        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {

        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {

        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }


}
