package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookSearchRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.Book;
import com.example.demo.repository.UserMapper;;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<Book> userPlanBookList(UserSearchRequest userSearchRequest) {
        return userMapper.userPlanBookList(userSearchRequest);
    }

    public List<Book> userPostBookList(UserSearchRequest userSearchRequest) {
        return userMapper.userPostBookList(userSearchRequest);
    }

    public void delete(BookSearchRequest bookSearchRequest) {
        userMapper.delete(bookSearchRequest);
    }

}
