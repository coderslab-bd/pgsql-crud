/**
 * 
 */
package com.coderslab.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderslab.entity.Category;
import com.coderslab.model.RecordStatus;
import com.coderslab.service.CategoryService;

/**
 * @author zubayer
 *
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	/* SAMPLE
	 * {
			companyCode: "017",
			status: "L",
			createDate: "2018-12-10T16:54:37.562+0000",
			createTime: "2018-12-10T16:54:37.562+0000",
			updateDate: null,
			updateTime: null,
			versionNo: 0,
			categoryId: 23,
			categoryName: "Sports",
			description: "All sports related items will be available here"
		}
	 */

	@RequestMapping
	public @ResponseBody Category loadCategoryView() {
		Category category = new Category();
		category.setCategoryName("Sports");
		category.setDescription("All sports related items will be available here");
		category.setStatus(RecordStatus.L);
		category.setCreateDate(new Date());
		category.setCreateTime(new Date());
		category.setCompanyCode("017");

		return categoryService.saveCategory(category);
	}
}
