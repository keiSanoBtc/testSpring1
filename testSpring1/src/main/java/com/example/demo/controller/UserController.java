package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.Book;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/userplanbooklist", method = RequestMethod.POST)
    public String userPlanBookList(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
    	List<Book> userPlanBookList = userService.userPlanBookList(userSearchRequest);
    	model.addAttribute("userPlanBookList", userPlanBookList);
        return "user";
    }

}