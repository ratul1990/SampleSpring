package com.practiseSpring.ratul.manager;

import com.practiseSpring.ratul.DAO.PersonDAOImpl;
import com.practiseSpring.ratul.DAO.PersonObject;
import com.practiseSpring.ratul.Model.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PersonManager {

    @Autowired
    PersonDAOImpl personDAOImpl;

    public boolean savePersonDetails(Person person)
    {
        PersonObject personO=new PersonObject();
        personO.setName(person.getUserName());
        personO.setDateOfBirth(person.getDateOfBirth());
        try {
            personDAOImpl.save(personO);
            return true;
        }
        catch (Exception O)
        {
            O.printStackTrace();
            return false;
        }
    }
}
