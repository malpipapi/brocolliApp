package com.minionz.backend.user.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MyPageResponseDto {

    private String age;
    private String name;
    private String height;
    private String weight;
    private String gender;

    public MyPageResponseDto(String age, String name, String height, String weight, String gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
}
