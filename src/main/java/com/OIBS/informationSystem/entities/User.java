package com.OIBS.informationSystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@MappedSuperclass
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    public String name;

    @Column(name = "surname")
    public String surname;

    @Column(name = "username")
    public String username;

    @Column(name = "password")
    public String password;
}
