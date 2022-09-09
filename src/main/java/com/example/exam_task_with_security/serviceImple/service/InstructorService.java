package com.example.exam_task_with_security.serviceImple.service;

import com.example.exam_task_with_security.model.Instructor;

import java.util.List;


public interface InstructorService {
    void saveInstructor(int id, Instructor instructor);
    void updateInstructor(int id,Instructor instructor);
    List<Instructor> getAllInstructors(int courseId);
    void deleteInstructorById(int id);
    void assignInstructorToCourse(int instId, int courseId);

    Instructor getInstructorById(int id);
}
