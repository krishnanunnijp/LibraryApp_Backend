package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.model.user;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userDao extends CrudRepository<user,Integer> {

    @Query(value = "SELECT `id`, `address`, `adhar`, `dob`, `email`, `name`, `password1`, `phonenumber`, `pincode`, `username` FROM `user` WHERE `username` =:username  AND `password1`=:password1 ",nativeQuery = true)
    List<user> passwordCheck(@Param("username") String username,@Param("password1") String password1);
}
