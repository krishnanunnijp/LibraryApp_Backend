package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.model.issue;
import org.springframework.data.repository.CrudRepository;

public interface issueDao extends CrudRepository<issue,Integer> {
}
