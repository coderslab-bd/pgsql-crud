/**
 * 
 */
package com.coderslab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderslab.entity.Category;
import com.coderslab.repository.CategoryRepository;

/**
 * @author zubayer
 *
 */
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	public Category findOne(Long categoryId) {
		return categoryRepository.findById(categoryId).orElse(null);
	}

	public Category updateCategory(Category category) {
		return saveCategory(category);
	}
}
