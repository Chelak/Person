package com.kz.person.service;

import com.kz.person.dao.PersonDAO;
import com.kz.person.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDAO personDAO;

    @Override
    @Transactional
    public Person addPerson(Person person) {
        return (Person) personDAO.saveAndFlush(person);
    }

    @Override
    @Transactional
    public Person getById(Long id) {
        return (Person) personDAO.findOne(id);
    }

    @Override
    @Transactional
    public List<Person> getAll() {
        return personDAO.findAll();
    }

    @Override
    @Transactional
    public Person editPerson(Person person) {
        return (Person) personDAO.saveAndFlush(person);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personDAO.delete(id);
    }
}
