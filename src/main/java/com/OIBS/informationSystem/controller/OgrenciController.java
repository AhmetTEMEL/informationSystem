package com.OIBS.informationSystem.controller;

import com.OIBS.informationSystem.dto.GetOgrenciDto;
import com.OIBS.informationSystem.service.abstracts.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.OIBS.informationSystem.entities.Ogrenci;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/ogrenciler")
public class OgrenciController {
    @Autowired
    private OgrenciService ogrenciService;

    public OgrenciController(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }

    @GetMapping("/getall")
    public List<GetOgrenciDto> get(){
        return this.ogrenciService.getAllStudents()
                .stream().map((Ogrenci ogrenci)->new GetOgrenciDto(
                        ogrenci.getId(),ogrenci.getName(),ogrenci.getSurname(),ogrenci.getUsername())).collect(Collectors.toList());
    }

    @GetMapping("/get/{id}")
    public Optional<GetOgrenciDto> getUserById(@PathVariable int id){
        return this.ogrenciService.getStudentById(id)
                .map((Ogrenci ogrenci)->new GetOgrenciDto(
                        id,ogrenci.getName(),ogrenci.getSurname(),ogrenci.getUsername()));
    }

    @GetMapping("/get")
    public Optional<GetOgrenciDto> getUserByName(@RequestParam String username){
        return this.ogrenciService.getUserByUsername(username)
                .map((Ogrenci ogrenci)-> new GetOgrenciDto(ogrenci.getId(),ogrenci.getName(),ogrenci.getSurname(),username));
    }

}
