package com.heroku.springboottutorial.controller;


import com.heroku.springboottutorial.dto.DummyDto;
import com.heroku.springboottutorial.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dummy")
public class DummyController {

    @Autowired
    private DummyService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAll() {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody DummyDto dummyEntity) {
        return new ResponseEntity(service.save(dummyEntity), HttpStatus.CREATED);
    }
}
