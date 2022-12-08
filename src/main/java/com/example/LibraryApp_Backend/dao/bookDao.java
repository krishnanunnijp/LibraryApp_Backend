package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.model.books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface bookDao extends CrudRepository<books,Integer> {

    @Query(value = "SELECT `id`, `description`, `image`, `title` FROM `books` WHERE `title`=:title",nativeQuery = true)
    List<books> searchBooks(@Param("title") String title);
}
