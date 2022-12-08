package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.model.user;
import org.springframework.data.repository.CrudRepository;

public interface userDao extends CrudRepository<user,Integer> {

}
