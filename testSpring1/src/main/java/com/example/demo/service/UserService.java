package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookSearchRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> userList() {
        return userMapper.userList();
    }

    public List<Book> userPlanBookList(UserSearchRequest userSearchRequest) {
        return userMapper.userPlanBookList(userSearchRequest);
    }

    public List<Book> userPostBookList(UserSearchRequest userSearchRequest) {
        return userMapper.userPostBookList(userSearchRequest);
    }

    public Book select(BookSearchRequest bookSearchRequest) {
       return userMapper.select(bookSearchRequest);
    }

    public void edit(BookSearchRequest bookSearchRequest) {
        userMapper.edit(bookSearchRequest);
     }

    public void delete(BookSearchRequest bookSearchRequest) {
        userMapper.delete(bookSearchRequest);
    }

    public void postbook(BookSearchRequest bookSearchRequest) {
        userMapper.postbook(bookSearchRequest);
    }

}
