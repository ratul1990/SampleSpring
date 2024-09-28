package com.practiseSpring.ratul.DAO;

import org.springframework.data.repository.CrudRepository;

public interface PersonDAOImpl extends CrudRepository<PersonObject, String> {
}
