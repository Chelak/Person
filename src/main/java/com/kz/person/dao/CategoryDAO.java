package com.kz.person.dao;

import com.kz.person.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by scelac on 4/19/16.
 */
public interface CategoryDAO extends JpaRepository<Category, Long> {
}
