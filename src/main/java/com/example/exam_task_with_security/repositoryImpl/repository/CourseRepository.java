package com.example.exam_task_with_security.repositoryImpl.repository;


import com.example.exam_task_with_security.model.Course;

import java.util.List;

public interface CourseRepository {

    void saveCourse(int id, Course course);

    List<Course> getAllCourses(int id);

    Course getCourseById(int id);

    void updateCourse(int id,Course course);

    void deleteCourse(int id);
}
