package com.example.exam_task_with_security.repositoryImpl.repository;

import com.example.exam_task_with_security.model.Task;

import java.util.List;

public interface TaskRepository {

    void saveTask(int lessId, Task task);

    void updateTask(int id,Task task);

    Task getTaskById(int id);

    List<Task> getAllTasks(int id);

    void deleteTaskById(int id);
}
