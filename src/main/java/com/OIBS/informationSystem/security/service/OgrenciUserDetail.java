package com.OIBS.informationSystem.security.service;

import com.OIBS.informationSystem.entities.Ogrenci;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Data
public class OgrenciUserDetail implements UserDetails {

    private int id;
    private String name;
    private String surname;
    private String username;
    private Collection<? extends GrantedAuthority> authorities;

    private OgrenciUserDetail(int id, String name, String surname, String username, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.authorities = authorities;
    }

    public static OgrenciUserDetail create(Ogrenci ogrenci){
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("USER"));
        return new OgrenciUserDetail(ogrenci.getId(),
                ogrenci.getName(),ogrenci.getSurname(),
                ogrenci.getUsername(),authorityList);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
