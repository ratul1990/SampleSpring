package com.practiseSpring.ratul.Controller;

import com.practiseSpring.ratul.Model.Person;
import com.practiseSpring.ratul.manager.PersonManager;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PersonController {

    @Autowired
    PersonManager personManager;

    @PutMapping(path="/save", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> savePersonDetails(@Valid @RequestBody Person person)
    {
        System.out.println("prod");
        boolean status=false;
        status=personManager.savePersonDetails(person);
        if(status)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}