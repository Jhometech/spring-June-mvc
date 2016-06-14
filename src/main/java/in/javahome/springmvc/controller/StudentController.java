package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.pojo.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String studentView() {
		return "addStudent";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudet(Student std) {
		System.out.println("Name"+std.getName());
		System.out.println("Phone"+std.getPhone());
		System.out.println("Course"+std.getCourse());
		return "addStudent";
	}
}
