package com.example.LibraryApp_Backend.controller;

import com.example.LibraryApp_Backend.dao.bookDao;
import com.example.LibraryApp_Backend.dao.issueDao;
import com.example.LibraryApp_Backend.dao.userDao;
import com.example.LibraryApp_Backend.model.books;
import com.example.LibraryApp_Backend.model.issue;
import com.example.LibraryApp_Backend.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    bookDao dao;
    @Autowired
    userDao dao2;
    @Autowired
    issueDao dao3;

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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<books> search(@RequestBody books b){
        return dao.searchBooks(b.getTitle());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> delete(@RequestBody books b) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println(String.valueOf(b.getId()));
        dao.deleteBooks(b.getId());
        map.put("status","success");
        return map;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> adduser(@RequestBody user u){
        HashMap<String, String> map = new HashMap<>();
        dao2.save(u);
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<user> login(@RequestBody user u){
        return dao2.passwordCheck(u.getUsername(),u.getPassword1());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addissue",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> addissue(@RequestBody issue i){
        HashMap<String, String> map = new HashMap<>();
        dao3.save(i);
        map.put("status","success");
        return map;
    }


}
