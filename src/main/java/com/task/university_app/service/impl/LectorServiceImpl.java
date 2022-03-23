package com.task.university_app.service.impl;

import com.task.university_app.model.Lector;
import com.task.university_app.repository.LectorRepository;
import com.task.university_app.service.LectorService;
import org.springframework.stereotype.Service;

@Service
public class LectorServiceImpl implements LectorService {
    private final LectorRepository lectorRepository;

    public LectorServiceImpl(LectorRepository lectorRepository) {
        this.lectorRepository = lectorRepository;
    }

    @Override
    public Lector getById(Long id) {
        return lectorRepository.getById(id);
    }

    @Override
    public Lector save(Lector lector) {
        return lectorRepository.save(lector);
    }
}
