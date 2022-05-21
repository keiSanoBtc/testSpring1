package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookSearchRequest implements Serializable {

  public Long user_id;

  public Long book_id;

  public Long book_name;

}