package com.task.university_app.service;

import java.util.List;
import com.task.university_app.model.Lector;

public interface ConsoleService {
    Lector findDepartmentHead(String input);

    String showStatistics(String input);

    String showTheAverageSalaryForTheDepartment(String input);

    int showCountOfEmployee(String input);

    List<String> globalSearch(String input);
}
