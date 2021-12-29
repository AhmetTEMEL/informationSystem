package com.OIBS.informationSystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Ogretmen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ogretmen extends User{


    @Column(name = "teacherId")
    private long teacherId;
}
