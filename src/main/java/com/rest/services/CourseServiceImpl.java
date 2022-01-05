package com.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.CourseDao;
import com.rest.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	//List<Courses> list;
	
	
	public CourseServiceImpl() {
//		
//		list = new ArrayList();
//		list.add(new Courses(101, "Spring boot", "Spring boot rest"));
//		list.add(new Courses(102, "Spring security", "Spring boot security"));
//		list.add(new Courses(103, "Spring data", "Spring boot data jpa"));
	}


	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}


	@Override
	public Courses getCourses(long courseId) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		
//		for (Courses courses : list) {
//			if (courses.getId()==courseId) {
//				
//				c=courses;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Courses addCourses(Courses courses) {
		// TODO Auto-generated method stub
//		list.add(courses);
		courseDao.save(courses);
		return courses;
	}


	@Override
	public Courses updateCourses(Courses courses) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if (e.getId() == courses.getId()) {
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//				
//			}
//		
//		
//	});
		courseDao.save(courses);
		return courses;

}



	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	Courses entity = 	courseDao.getOne(parseLong);
	courseDao.delete(entity);
	}


	

		
			}
