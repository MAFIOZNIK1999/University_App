package com.task.university_app.config;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import com.task.university_app.model.Degree;
import com.task.university_app.model.Department;
import com.task.university_app.model.Lector;
import com.task.university_app.service.DepartmentService;
import com.task.university_app.service.LectorService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final DepartmentService departmentService;
    private final LectorService lectorService;

    public DataInitializer(DepartmentService departmentService, LectorService lectorService) {
        this.departmentService = departmentService;
        this.lectorService = lectorService;
    }

    @PostConstruct
    public void inject() {
        Lector max = new Lector("Max", "Mosh",
                10000.0, Degree.PROFESSOR);
        lectorService.save(max);
        Lector alex = new Lector("Alex", "Bosh",
                1000.0, Degree.ASSOCIATE_PROFESSOR);
        lectorService.save(alex);
        Lector katya = new Lector("Katya", "Koval",
                444.0, Degree.ASSISTANT);
        lectorService.save(katya);
        Department biology = new Department("Biology", 1L);
        List<Lector> biologyLectors = new ArrayList<>();
        biologyLectors.add(max);
        biologyLectors.add(katya);
        biology.setLectors(biologyLectors);
        Department astronomy = new Department("Astronomy", 2L);
        List<Lector> astronomyLectors = new ArrayList<>();
        astronomyLectors.add(alex);
        astronomyLectors.add(max);
        astronomy.setLectors(astronomyLectors);
        departmentService.save(biology);
        departmentService.save(astronomy);
    }
}
