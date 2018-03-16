package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getallBooks(){
		return Arrays.asList(new Book(1L,"Book 1", "Author panshito"));
	}
	
	

}
