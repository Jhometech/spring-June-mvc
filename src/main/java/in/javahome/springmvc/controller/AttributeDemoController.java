package in.javahome.springmvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttributeDemoController {
	@RequestMapping(value="/time")
	public String time(ModelMap map) {
		map.addAttribute("now", new Date());
		return "time.jsp";
	}
}
