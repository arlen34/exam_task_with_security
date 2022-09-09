package com.example.exam_task_with_security.repositoryImpl.repository;


import com.example.exam_task_with_security.model.Student;

import java.util.List;

public interface StudentRepository {
    void saveStudent(int id, Student student);

    void updateStudent(int id,Student student);

    List<Student> getAllStudents(int id);

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void assignStudentToCourse(int studentId,int courseId);

}
