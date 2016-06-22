package in.javahome.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springmvc.pojo.Student;

@Component
public class StudentDAO {
	@Autowired
	private HibernateTemplate template;

	@Transactional
	public List<Student> findAll() {
		return (List<Student>) template.find("from Student");
	}
	@Transactional
	public void addStudent(Student std){
		template.save(std);
	}
}
