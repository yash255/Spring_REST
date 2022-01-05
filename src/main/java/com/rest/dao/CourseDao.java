package com.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses,Long> {

}
