package in.javahome.springmvc.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import in.javahome.springmvc.pojo.Student;

public class StudentExcelView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook book, HttpServletRequest arg2,
			HttpServletResponse arg3) throws Exception {
		List<Student> stdList = (List<Student>) map.get("stdList");
		System.out.println("STD DATA"+stdList);
		Sheet sheet = book.createSheet("Students");
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Phone");
		header.createCell(3).setCellValue("Course");
//		Set student data to the sheet
		for (int i=0; i< stdList.size(); i++) {
			Row data = sheet.createRow(i+1);
			Cell c1 = data.createCell(0);
			c1.setCellValue(stdList.get(i).getStdId());
			data.createCell(0).setCellValue(stdList.get(i).getStdId());
			data.createCell(1).setCellValue(stdList.get(i).getName());
			data.createCell(2).setCellValue(stdList.get(i).getCourse());
			data.createCell(3).setCellValue(stdList.get(i).getPhone());
			
		}
	}

}
