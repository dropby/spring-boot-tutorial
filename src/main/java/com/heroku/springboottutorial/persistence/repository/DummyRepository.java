package com.heroku.springboottutorial.persistence.repository;

import com.heroku.springboottutorial.persistence.entity.DummyEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Erik on 11/12/2016.
 */
public interface DummyRepository extends CrudRepository<DummyEntity, Long> {
}
