package com.OIBS.informationSystem.repository;

import com.OIBS.informationSystem.entities.Yonetici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YoneticiDao extends JpaRepository<Yonetici,Integer> {
}
