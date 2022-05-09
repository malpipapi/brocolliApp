package com.minionz.backend.foodlist.controller.dto;

import com.minionz.backend.foodlist.domain.FoodList;
import lombok.Getter;

import java.util.List;

@Getter
public class FoodListResponseDto {
    private final String foodListName;
    private final double foodKcal;
    private final double foodTan;
    private final double foodDan;
    private final double foodJi;

    public FoodListResponseDto(FoodList foodList){
        this.foodListName=foodList.getFoodListName();
        this.foodKcal=foodList.getFoodKcal();
        this.foodTan=foodList.getFoodTan();
        this.foodDan=foodList.getFoodDan();
        this.foodJi=foodList.getFoodJi();
    }
}
