package com.minionz.backend.user.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserChangeRequestDto {
    private String age;
    private String name;
    private String height;
    private String weight;
    private String gender;

    @Builder
    public UserChangeRequestDto(String age, String name, String height, String weight, String gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
}
