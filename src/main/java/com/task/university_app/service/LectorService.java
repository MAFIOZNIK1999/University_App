package com.task.university_app.service;

import com.task.university_app.model.Lector;

public interface LectorService {
    Lector getById(Long id);

    Lector save(Lector lector);
}
