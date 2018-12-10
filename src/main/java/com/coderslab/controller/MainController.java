/**
 * 
 */
package com.coderslab.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderslab.entity.Student;
import com.coderslab.model.ResponseHelper;
import com.coderslab.service.StudentService;

/**
 * @author zubayer
 *
 */
@Controller
@RequestMapping("/")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	StudentService studentService;

	@RequestMapping
	public String loadHomePage(Model model) {
		logger.info("Getting all students list");
		model.addAttribute("students", studentService.getAllSutdent());
		return "views/index";
	}

	@RequestMapping("/all")
	public @ResponseBody List<Student> getAllStudent() {
		logger.info("Getting all student list");
		return studentService.getAllSutdent();
	}

	@RequestMapping("/add")
	public @ResponseBody ResponseHelper addStudent(Student student) {
		logger.info("Adding new student");
		ResponseHelper response = new ResponseHelper();
		student = studentService.addStudent(student);
		if (student != null && student.getStudentId() != null) {
			response.setStatus(true);
			response.setMessage("Student info add successfully");
		} else {
			response.setStatus(false);
			response.setMessage("Student info not add");
		}
		return response;
	}
}
