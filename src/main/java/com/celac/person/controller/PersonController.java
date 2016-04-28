package com.celac.person.controller;

import com.celac.person.entity.Person;
import com.celac.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person findById(@PathVariable Long id)
    {
        Person person = personService.getById(id);
        return person;
    }
    @RequestMapping(method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person)
    {
        return personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAll()
    {
        return  personService.getAll();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
    public Person update(@PathVariable Long id, @RequestBody Person person)
    {
        Person editPerson = personService.getById(id);
        if (editPerson !=null)
        {
            editPerson.setFirstName(person.getFirstName());
            editPerson.setLastName(person.getLastName());
            editPerson.setEmail(person.getEmail());
            editPerson.setBirthDate(person.getBirthDate());
            editPerson.setAboutPerson(person.getAboutPerson());
            editPerson.setLanguage(person.getLanguage());
            personService.editPerson(editPerson);

        }

        return null;
    }
}
