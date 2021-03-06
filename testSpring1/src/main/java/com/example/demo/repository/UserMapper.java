package com.example.demo.repository;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BookSearchRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;


@Mapper
public interface UserMapper {

	List<User> userList();

    List<Book> userPlanBookList(UserSearchRequest user);

    List<Book> userPostBookList(UserSearchRequest user);

    void delete(BookSearchRequest book);

    void edit(BookSearchRequest book);

    Book select(BookSearchRequest book);

    void postbook(BookSearchRequest book);

}