package com.OIBS.informationSystem.service.concrete;

import com.OIBS.informationSystem.entities.Ogrenci;
import com.OIBS.informationSystem.repository.OgrenciDao;
import com.OIBS.informationSystem.service.abstracts.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OgrenciManager implements OgrenciService {

    @Autowired
    private OgrenciDao ogrenciDao;

    public OgrenciManager(OgrenciDao ogrenciDao) {
        this.ogrenciDao = ogrenciDao;
    }

    @Override
    @Transactional
    public List<Ogrenci> getAllStudents() {
        return this.ogrenciDao.findAll();
    }

    @Override
    @Transactional
    public Optional<Ogrenci> getStudentById(int id) {
        return this.ogrenciDao.findById(id);
    }

    @Override
    public Optional<Ogrenci> getUserByUsername(String username) {
        return this.ogrenciDao.findByUsername(username);
    }
}
