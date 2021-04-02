package com.boot.spring.springbootudemy.dao;

import com.boot.spring.springbootudemy.entity.PeopleEntity;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PeopleDAOImpl implements PeopleDAO{

    private EntityManager entityManager;
    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<PeopleEntity> getAllPeople() {
//        Session session = entityManager.unwrap(Session.class);
//        List<PeopleEntity> result = session.createQuery("FROM PeopleEntity",PeopleEntity.class).getResultList();
        Query query= entityManager.createQuery("FROM PeopleEntity");
        List<PeopleEntity> result = query.getResultList();
        return result;
    }

    @Override
    public void savePerson(PeopleEntity person) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(person);
        PeopleEntity peopleEntity = entityManager.merge(person);
        person.setPeopleId(peopleEntity.getPeopleId());
    }

    @Override
    public PeopleEntity getPerson(int peopleId) {
//        Session session = entityManager.unwrap(Session.class);
//        PeopleEntity person = session.get(PeopleEntity.class, peopleId);
        PeopleEntity person = entityManager.find(PeopleEntity.class, peopleId);
        return person;
    }

    @Override
    public void deletePerson(int personId) {
//        Session session = entityManager.unwrap(Session.class);
//        Query<PeopleEntity> query = session.createQuery("DELETE FROM PeopleEntity WHERE peopleId "
//        + "= : currentPerson");
//        query.setParameter("currentPerson", personId);
//        query.executeUpdate();
        Query query = entityManager.createQuery("DELETE FROM PeopleEntity WHERE peopleId "
        + "= : currentPerson");
        query.setParameter("currentPerson", personId);
        query.executeUpdate();
    }
}
