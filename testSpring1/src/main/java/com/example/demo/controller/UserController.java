package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.BookSearchRequest;
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
    	List<Book> userPostBookList = userService.userPostBookList(userSearchRequest);
    	model.addAttribute("userPlanBookList", userPlanBookList);
    	model.addAttribute("userPostBookList", userPostBookList);
        return "user";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute BookSearchRequest bookSearchRequest, Model model) {
    	Book book = userService.select(bookSearchRequest);
    	model.addAttribute("editBook", book);
        return "edit";
    }

    @RequestMapping(value = "/edit_confirm", method = RequestMethod.POST)
    public String edit_confirm(@ModelAttribute BookSearchRequest bookSearchRequest, Model model) {
    	userService.edit(bookSearchRequest);
        return "edit_confirm";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@ModelAttribute BookSearchRequest bookSearchRequest, Model model) {
    	userService.delete(bookSearchRequest);
        return "delete_confirm";
    }

}