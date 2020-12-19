package com.example.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hibernate.query.Query;
import java.util.List;

@Repository
public class AnimalDaoImpl implements AnimalDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public  boolean saveAnimal(Animals animal) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().save(animal);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    @Override
    public boolean deleteAnimal(Animals animal) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().delete(animal);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public  boolean updateAnimal(Animals animal) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().update(animal);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }



    @Override
    public List<Animals> getAnimals() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Animals> query=currentSession.createQuery("from Animals", Animals.class);
        List<Animals> list=query.getResultList();
        return list;
    }
    @Override
    public List<Animals> getAnimalById(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Animals> query=currentSession.createQuery("from Animals where id=:id", Animals.class);
        query.setParameter("id", id);
        List<Animals> animals=query.getResultList();
        return animals;
    }

    @Override
    public List<Animals> getAnimalByName(String name) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Animals> query=currentSession.createQuery("from Animals where name=:name", Animals.class);
        query.setParameter("name", name);
        List<Animals> animals=query.getResultList();
        return animals;
    }


}
