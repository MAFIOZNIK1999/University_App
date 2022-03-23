package com.task.university_app.service.impl;

import java.util.List;
import com.task.university_app.model.Department;
import com.task.university_app.repository.DepartmentRepository;
import com.task.university_app.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department getById(Long id) {
        return departmentRepository.getById(id);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getByName(String name) {
        return departmentRepository.findAll().stream()
                .filter(d -> d.getName().equals(name))
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("Can't find department by name: " + name));
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}
