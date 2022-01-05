package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Courses;
import com.rest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		
		return this.courseService.getCourses();
	}
	
	//get single course
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	
	//add course
	@PostMapping("/courses" )
	public Courses addCourses(@RequestBody Courses courses) {
		
		return this.courseService.addCourses(courses);
	}
	
	//update course
	@PutMapping("/courses/{courseId}" )
	public Courses updateCourses(@RequestBody Courses courses) {
		
		return this.courseService.updateCourses(courses);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
