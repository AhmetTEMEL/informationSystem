package com.OIBS.informationSystem.service.abstracts;

import com.OIBS.informationSystem.entities.Ogrenci;

import java.util.List;
import java.util.Optional;

public interface OgrenciService {
    List<Ogrenci> getAllStudents();
    Optional<Ogrenci> getStudentById(int id);
    Optional<Ogrenci> getUserByUsername(String username);
}
