package com.OIBS.informationSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOgrenciDto {
    private int id;
    private String name;
    private String surname;
    private String username;
}
