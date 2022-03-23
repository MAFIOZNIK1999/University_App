package com.task.university_app.service;

import java.util.List;
import com.task.university_app.model.Department;

public interface DepartmentService {
    Department getById(Long id);

    List<Department> getAll();

    Department getByName(String name);

    Department save(Department department);
}
