package com.OIBS.informationSystem.repository;

import com.OIBS.informationSystem.entities.Ogretmen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgretmenDao extends JpaRepository<Ogretmen,Integer> {
}
