/**
 * 
 */
package com.coderslab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zubayer
 *
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Category extends AbstractModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "categoryId", nullable = false, unique = true)
	private Long categoryId;

	@Column(name = "categoryName", length = 100)
	private String categoryName;

	@Column(name = "description", length = 100)
	private String description;
}
