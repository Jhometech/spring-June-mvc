package in.javahome.springmvc.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import in.javahome.springmvc.pojo.Student;

public class StudentPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse arg4) throws Exception {
		List<Student> stdList = (List<Student>) map.get("stdList");
		// Logic to build PDF document
		Table table = new Table(4);
//		Add header to to the PDF
		table.addCell("ID");
		table.addCell("Name");
		table.addCell("Phone");
		table.addCell("Course");
//		Set data to the PDF
		for (Student student : stdList) {
			table.addCell(student.getStdId()+"");
			table.addCell(student.getName());
			table.addCell(student.getPhone());
			table.addCell(student.getCourse());
		}
		doc.add(table);
	}

}
