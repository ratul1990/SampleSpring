package Controller;

import Model.Person;
import jakarta.validation.Valid;
import manager.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PersonController {

//    @Autowired
//    PersonManager personManager;

    @PutMapping(path="/{username}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> savePersonDetails(@PathVariable String userName,
                                               @Valid @RequestBody Person person)
    {
        System.out.println("test");
        System.out.println(userName);
        boolean status=false;
        //status=personManager.savePersonDetails(person);
        if(status)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}