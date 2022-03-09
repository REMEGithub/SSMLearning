package com.xia.dao;

import com.xia.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books book);
    int deleteBookById(@Param("bookId") int id);
    int updateBook(Books book);
    Books queryBookById(@Param("bookId") int id);
    List<Books> queryAllBooks();
}
