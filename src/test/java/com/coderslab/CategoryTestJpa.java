/**
 * 
 */
package com.coderslab;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.hibernate.dialect.unique.DB2UniqueDelegate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.event.TransactionalEventListenerFactory;

import com.coderslab.entity.Category;
import com.coderslab.model.RecordStatus;
import com.coderslab.service.CategoryService;

/**
 * @author zubayer
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = {PgsqlCrudApplication.class})
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class,
	TransactionalTestExecutionListener.class,
})
@DataJpaTest
public class CategoryTestJpa {
	private static final Logger logger = LoggerFactory.getLogger(CategoryTestJpa.class);

	@Autowired
	CategoryService categoryService;

	@Test
	public void testAddCategory() {
		Category category = new Category();
		category.setCategoryName("Sports");
		category.setDescription("All sports related items will be available here");
		category.setStatus(RecordStatus.L);
		category.setCreateDate(new Date());
		category.setCreateTime(new Date());
		category.setCompanyCode("017");

		category = categoryService.saveCategory(category);

		assertNotNull(category.getCategoryId());
		logger.info("Saved category is : {}", category.toString());
	}
}
