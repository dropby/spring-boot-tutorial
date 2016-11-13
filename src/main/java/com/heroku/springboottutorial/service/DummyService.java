package com.heroku.springboottutorial.service;

import com.heroku.springboottutorial.dto.DummyDto;
import com.heroku.springboottutorial.persistence.entity.DummyEntity;

import java.util.List;

public interface DummyService {
    List<DummyDto> getAll();

    DummyEntity save(DummyDto dummyEntity);
}
