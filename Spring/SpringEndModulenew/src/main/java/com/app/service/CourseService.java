package com.app.service;

import com.app.pojos.Course;

public interface CourseService {
	
	Course addCourseDetails(Course course);
	Course getCourseDetailsById(Long id);

}
