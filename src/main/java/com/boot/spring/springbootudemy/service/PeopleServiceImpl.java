package com.boot.spring.springbootudemy.service;

import com.boot.spring.springbootudemy.dao.PeopleDAO;
import com.boot.spring.springbootudemy.entity.PeopleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{

    private PeopleDAO peopleDAO;

    @Autowired
    public void setPeopleDAO(PeopleDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    @Override
    @Transactional
    public List<PeopleEntity> getAllPeople(){
        return peopleDAO.getAllPeople();
    }

    @Override
    @Transactional
    public void savePerson(PeopleEntity person) {
        peopleDAO.savePerson(person);
    }

    @Override
    @Transactional
    public PeopleEntity getPerson(int peopleId) {
        return peopleDAO.getPerson(peopleId);
    }

    @Override
    @Transactional
    public void deletePerson(int personId) {
        peopleDAO.deletePerson(personId);
    }
}
