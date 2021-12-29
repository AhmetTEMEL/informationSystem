package com.OIBS.informationSystem.security.service;

import com.OIBS.informationSystem.entities.Ogrenci;
import com.OIBS.informationSystem.repository.OgrenciDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private OgrenciDao ogrenciDao;

    public JwtUserDetailsService(OgrenciDao ogrenciDao){
        this.ogrenciDao=ogrenciDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Ogrenci ogrenci = ogrenciDao.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        System.out.println(ogrenci.getId());
     /*   if ("javainuse".equals(username)) {
            return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }*/
        return OgrenciUserDetail.create(ogrenci);
    }

    public UserDetails loadUserById(int id){
        Ogrenci ogrenci = ogrenciDao.findById(id).orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + id));
        return OgrenciUserDetail.create(ogrenci);
    }
}

