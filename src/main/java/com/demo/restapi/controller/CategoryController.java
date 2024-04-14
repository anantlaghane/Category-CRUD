package com.demo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restapi.entity.Category;
import com.demo.restapi.repository.CategoryRepository;

@RestController
public class CategoryController {
	@Autowired
	CategoryRepository repo;
	
	@GetMapping("/category")
	public List<Category> getAllCategorys(){
		List<Category>categorys = repo.findAll();
		return categorys;
	}
	
	 @GetMapping("/category/{id}")
	   public Category getCategory (@PathVariable int id) {
		   Category category =repo.findById(id).get();
		   
		   return category;
		   
	   }
	 
	 @PostMapping("/category/add")
	    @ResponseStatus(code = HttpStatus.CREATED)
	    public void createCategory(@RequestBody Category category) {
	    	repo.save(category);
	    	
	    }
	 
	 @PutMapping("/category/update/{id}")
		public Category updatCategory(@PathVariable int id) {
			Category category = repo.findById(id).get();
			category.setProduct_code("NBC");
			category.setName("NoteBook");
			category.setQuntity(741);
			category.setPrice(20.0);
			repo.save(category);
			return category;
			
		}
	 
	 @DeleteMapping("/category/delete/{id}")
		public void removeCategory(@PathVariable int id) {
			Category category = repo.findById(id).get();
			repo.delete(category);
		}
	 
			

}
