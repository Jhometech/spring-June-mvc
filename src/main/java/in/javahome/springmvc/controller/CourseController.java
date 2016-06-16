package in.javahome.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.dao.CourseDAO;
import in.javahome.springmvc.pojo.Course;

@Controller
public class CourseController {
	@Autowired
	private CourseDAO dao;
	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public String getCourseForm(ModelMap map) {
		map.addAttribute("course", new Course());
		return "course";
	}

	@RequestMapping(value = "/course", method = RequestMethod.POST)
	public String addCourse(@ModelAttribute("course") Course course) {
         dao.saveCourse(course);
		return "course";
	}

}
