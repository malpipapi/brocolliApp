package com.minionz.backend.calendar.controller.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SumFoodResponseDto {
    private double sumFoodKcal;
    private double sumFoodTan;
    private double sumFoodDan;
    private double sumFoodJi;
    private String foodDate;

    public SumFoodResponseDto(double sumFoodKcal, double sumFoodTan, double sumFoodDan, double sumFoodJi,String foodDate) {
        this.sumFoodKcal = sumFoodKcal;
        this.sumFoodTan = sumFoodTan;
        this.sumFoodDan = sumFoodDan;
        this.sumFoodJi = sumFoodJi;
        this.foodDate = foodDate;
    }
}
