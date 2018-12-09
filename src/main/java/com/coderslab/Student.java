/**
 * 
 */
package com.coderslab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author zubayer
 *
 */
@Data
@Entity
@Table(name = "student", schema = "public")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId", nullable = false, unique = true)
	private Long studentId;

	@Column(name = "name", length = 50)
	private String name;
}
