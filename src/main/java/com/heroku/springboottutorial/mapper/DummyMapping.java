package com.heroku.springboottutorial.mapper;

import com.heroku.springboottutorial.dto.DummyDto;
import com.heroku.springboottutorial.persistence.entity.DummyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class DummyMapping {
    public static DummyMapping INSTANCE = Mappers.getMapper(DummyMapping.class);

    public abstract DummyDto dummyEntityToDto (DummyEntity dummyEntity);

    public abstract List<DummyDto> dummyEntityToDto (List<DummyEntity> dummyEntity);

    public abstract DummyEntity dummyDtoToEntity (DummyDto dummyDto);

    public abstract List<DummyEntity> dummyDtoToEntity (List<DummyDto> dummyDto);
}