package com.OIBS.informationSystem.repository;

import com.OIBS.informationSystem.entities.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OgrenciDao extends JpaRepository<Ogrenci,Integer> {
    Optional<Ogrenci> findByUsername(String username);
}
