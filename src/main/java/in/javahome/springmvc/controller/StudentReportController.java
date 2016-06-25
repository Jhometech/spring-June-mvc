package in.javahome.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import in.javahome.springmvc.dao.StudentDAO;
import in.javahome.springmvc.pojo.Student;
import in.javahome.springmvc.view.StudentExcelView;
import in.javahome.springmvc.view.StudentPdfView;

@Controller
public class StudentReportController {
	@Autowired
	private StudentDAO dao;
	@RequestMapping(value="/pdf")
	public View pdfReport(ModelMap map){
		// get data from db
		List<Student> stdList = dao.findAll();
		map.addAttribute("stdList", stdList);
		StudentPdfView pdfView = new StudentPdfView();
		// convert data to pdf
		// return pdf view
		return pdfView;
	}
	
	@RequestMapping(value="/excel")
	public View excelReport(ModelMap map){
		// get data from db
		List<Student> stdList = dao.findAll();
		map.addAttribute("stdList", stdList);
		StudentExcelView excelView = new StudentExcelView();
		return excelView;
	}
}
