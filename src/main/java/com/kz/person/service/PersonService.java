package com.kz.person.service;

import com.kz.person.entity.Person;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
public interface PersonService
{
    public Person addPerson(Person person);
    public void delete(Long id);
    public Person getById(Long id);
    public List<Person> getAll();
    public Person editPerson (Person person);


}
