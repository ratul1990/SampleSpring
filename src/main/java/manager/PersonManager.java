package manager;

import DAO.PersonDAOImpl;
import DAO.PersonObject;
import Model.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

//@Getter
//@Setter
public class PersonManager {

//    @Autowired
//    PersonDAOImpl personDAOImpl;
//
//    public boolean savePersonDetails(Person person)
//    {
//        PersonObject personO=new PersonObject();
//        personO.setName(person.getUserName());
//        personO.setDateOfBirth(person.getDateOfBirth());
//        try {
//            personDAOImpl.save(personO);
//            return true;
//        }
//        catch (Exception O)
//        {
//            O.printStackTrace();
//            return false;
//        }
//    }
}
