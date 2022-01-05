package com.rest.services;

import java.util.List;

import com.rest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	public Courses getCourses(long courseId);
	public Courses addCourses(Courses courses);
	public Courses updateCourses(Courses courses);
	public void deleteCourse(long parseLong);
	
	
}
