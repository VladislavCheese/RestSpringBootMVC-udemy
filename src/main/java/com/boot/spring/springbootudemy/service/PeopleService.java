package com.boot.spring.springbootudemy.service;

import com.boot.spring.springbootudemy.entity.PeopleEntity;

import java.util.List;

public interface PeopleService {
    List<PeopleEntity> getAllPeople();

    void savePerson(PeopleEntity person);

    PeopleEntity getPerson(int peopleId);

    void deletePerson(int personId);
}
