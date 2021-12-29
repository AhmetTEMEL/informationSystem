package com.OIBS.informationSystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Ogrenci")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ogrenci extends User{


    @Column(name = "StudentId")
    private long StudentId;
}
