package com.example.LibraryApp_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "issue")
public class issue {

    @Id
    @GeneratedValue()
    private int id;
    private String name;
    private String title;
    private String document;
    private int membership;

    public issue() {
    }

    public issue(int id, String name, String title, String document, int membership) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.document = document;
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }
}
