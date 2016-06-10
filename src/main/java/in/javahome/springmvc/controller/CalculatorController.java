package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
	
	@RequestMapping(value="/add")
	@ResponseBody
	public String add(@RequestParam("x") int x, @RequestParam("y") int y){
	 int result = x+y;
	 return "Addition of "+x+" And "+y+" is "+result;
	}
}
