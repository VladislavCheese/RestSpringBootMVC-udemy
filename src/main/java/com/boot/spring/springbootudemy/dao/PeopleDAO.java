package com.boot.spring.springbootudemy.dao;

import com.boot.spring.springbootudemy.entity.PeopleEntity;

import java.util.List;

public interface PeopleDAO {
    List<PeopleEntity> getAllPeople();

    void savePerson(PeopleEntity person);

    PeopleEntity getPerson(int peopleId);

    void deletePerson(int personId);
}
