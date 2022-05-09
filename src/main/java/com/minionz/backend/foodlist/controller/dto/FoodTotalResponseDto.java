package com.minionz.backend.foodlist.controller.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class FoodTotalResponseDto {
    private double foodKcal;
    private double foodTan;
    private double foodDan;
    private double foodJi;
    private String foodtime;

    public FoodTotalResponseDto(double foodKcal, double foodTan, double foodDan, double foodJi,String foodtime) {
        this.foodKcal = foodKcal;
        this.foodTan = foodTan;
        this.foodDan = foodDan;
        this.foodJi = foodJi;
        this.foodtime = foodtime;
    }
}
