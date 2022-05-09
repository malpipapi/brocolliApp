package com.minionz.backend.foodlist.controller.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class FoodListFoodNameResponseDto {
    private String foodListName;
    private double foodKcal;
    private double foodTan;
    private double foodDan;
    private double foodJi;

    public FoodListFoodNameResponseDto(String foodListName, double foodKcal, double foodTan, double foodDan, double foodJi) {
        this.foodListName = foodListName;
        this.foodKcal = foodKcal;
        this.foodTan = foodTan;
        this.foodDan = foodDan;
        this.foodJi = foodJi;
    }
}
