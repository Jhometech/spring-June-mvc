package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome",method=RequestMethod.GET)
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring MVC!!!";
	}
}
