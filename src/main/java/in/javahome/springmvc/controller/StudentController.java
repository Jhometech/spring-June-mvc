package in.javahome.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.dao.StudentDAO;
import in.javahome.springmvc.pojo.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO dao;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String studentView(ModelMap map) {
		map.addAttribute("std", new Student());
		return "addStudent";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudet(@ModelAttribute("std") @Valid Student std, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error are there");
			return "addStudent";
		} else {
			System.out.println("Error are not there");
			dao.addStudent(std);
			return "success";
		}
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public String fetchAllStudents(ModelMap map) {
		map.addAttribute("studentList", dao.findAll());
		return "studentsList";
	}
}
