package com.example.LibraryApp_Backend.controller;

import com.example.LibraryApp_Backend.dao.bookDao;
import com.example.LibraryApp_Backend.model.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    bookDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public List<books> find() {
        return (List<books>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> add(@RequestBody books b){
        HashMap<String, String> map = new HashMap<>();
        dao.save(b);
        map.put("status","success");
        return map;
    }


}
