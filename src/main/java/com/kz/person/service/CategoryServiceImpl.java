package com.kz.person.service;

import com.kz.person.dao.CategoryDAO;
import com.kz.person.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryDAO categoryDAO;


    @Override
    @Transactional
    public Category addCategory(Category category) {
        return categoryDAO.saveAndFlush(category);
    }

    @Override
    @Transactional
    public Category getById(Long id) {
        return categoryDAO.findOne(id);
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        return categoryDAO.findAll();
    }

    @Override
    @Transactional
    public Category editCategory(Category category) {
        return categoryDAO.saveAndFlush(category);
    }

    @Override
    @Transactional
    public void delete(Long id) {
            categoryDAO.delete(id);
    }
}
