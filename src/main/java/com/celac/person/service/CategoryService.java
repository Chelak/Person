package com.celac.person.service;

import com.celac.person.entity.Category;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
public interface CategoryService {
    public Category addCategory(Category category);
    public Category getById(Long id);
    public List<Category> getAll();
    public Category editCategory(Category category);
    public void delete(Long id);
}
