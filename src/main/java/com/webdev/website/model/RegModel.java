package com.webdev.website.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "signup")
@Data
@AllArgsConstructor

public class RegModel {

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "pswd")
    private String pswd;


    public RegModel() {}
}
