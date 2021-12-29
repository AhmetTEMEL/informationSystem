package com.OIBS.informationSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetYoneticiDto {
    private int id;
    private String name;
    private String surname;
}
