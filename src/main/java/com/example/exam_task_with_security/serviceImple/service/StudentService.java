package com.example.exam_task_with_security.serviceImple.service;

import com.example.exam_task_with_security.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(int id, Student student);

    void updateStudent(int id,Student student);

    List<Student> getAllStudents(int id);

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void assignStudentToCourse(int studentId,int courseId);

    // List<Student> countOfStudents(int id);
}
