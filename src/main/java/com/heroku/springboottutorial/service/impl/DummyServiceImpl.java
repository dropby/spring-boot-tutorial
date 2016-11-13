package com.heroku.springboottutorial.service.impl;

import com.heroku.springboottutorial.dto.DummyDto;
import com.heroku.springboottutorial.mapper.DummyMapping;
import com.heroku.springboottutorial.persistence.entity.DummyEntity;
import com.heroku.springboottutorial.persistence.repository.DummyRepository;
import com.heroku.springboottutorial.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {
    @Autowired
    private DummyRepository dummyRepository;

    public List<DummyDto> getAll() {
        return DummyMapping.INSTANCE.dummyEntityToDto((List<DummyEntity>) dummyRepository.findAll());
    }

    public DummyEntity save(DummyDto dummyEntity) {
        return dummyRepository.save(DummyMapping.INSTANCE.dummyDtoToEntity(dummyEntity));
    }
}
