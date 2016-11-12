package com.heroku.springboottutorial.service;

import com.heroku.springboottutorial.persistence.entity.DummyEntity;
import org.springframework.ui.Model;

import java.util.List;

public interface DummyService {
    List<DummyEntity> getAll();

    DummyEntity save(DummyEntity dummyEntity);
}
