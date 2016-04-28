package com.celac.person.controller;

import com.celac.person.entity.Category;
import com.celac.person.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAll()
    {
        return categoryService.getAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Category addCategory(@RequestBody Category category)
    {
        return categoryService.addCategory(category);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Category findById(@PathVariable Long id)
    {
        return categoryService.getById(id);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Category editCategory(@RequestBody Category category)
    {
        return categoryService.editCategory(category);
    }
}
