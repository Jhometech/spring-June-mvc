package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.pojo.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String studentView(ModelMap map) {
		map.addAttribute("std", new Student());
		return "addStudent";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudet(@ModelAttribute("std") Student std, ModelMap map) {
		System.out.println("Name"+std.getName());
		System.out.println("Phone"+std.getPhone());
		System.out.println("Course"+std.getCourse());
		 if(std.getName() == null || std.getName().equals("")){
//			 Name is not valid
			 return "addStudent";
		 }
		
		return "addStudent";
	}
}
