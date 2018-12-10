/**
 * 
 */
package com.coderslab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslab.entity.Category;

/**
 * @author zubayer
 *
 */
@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
