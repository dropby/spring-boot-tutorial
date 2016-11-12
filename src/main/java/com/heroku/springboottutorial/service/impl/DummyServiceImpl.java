package com.heroku.springboottutorial.service.impl;

import com.heroku.springboottutorial.persistence.entity.DummyEntity;
import com.heroku.springboottutorial.persistence.repository.DummyRepository;
import com.heroku.springboottutorial.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {
    @Autowired
    DummyRepository dummyRepository;

    @Override
    public List<DummyEntity> getAll() {
        return (List<DummyEntity>) dummyRepository.findAll();
    }

    @Override
    public DummyEntity save(DummyEntity dummyEntity) {
        return dummyRepository.save(dummyEntity);
    }
}
