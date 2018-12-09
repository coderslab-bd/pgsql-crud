/**
 * 
 */
package com.coderslab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslab.Student;

/**
 * @author zubayer
 *
 */
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long>{

}
