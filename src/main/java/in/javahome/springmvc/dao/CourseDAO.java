package in.javahome.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springmvc.pojo.Course;

@Component
public class CourseDAO {
	@Autowired
	private HibernateTemplate template;

	@Transactional
	public void saveCourse(Course c) {
		template.save(c);
	}
}
