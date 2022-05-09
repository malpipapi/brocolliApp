package com.minionz.backend.foodlist.controller.dto;

import com.minionz.backend.foodlist.domain.Food;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FoodRequestDto {
    private String food_Name1;
    private String food_Name2;
    private String food_Name3;
    private String food_Name4;
    private String food_Name5;
    private int foodperson1;
    private int foodperson2;
    private int foodperson3;
    private int foodperson4;
    private int foodperson5;
    private String foodtime;

    public FoodRequestDto(String food_Name1, String food_Name2, String food_Name3, String food_Name4, String food_Name5, int foodperson1, int foodperson2, int foodperson3, int foodperson4, int foodperson5,String foodtime) {
        this.food_Name1 = food_Name1;
        this.food_Name2 = food_Name2;
        this.food_Name3 = food_Name3;
        this.food_Name4 = food_Name4;
        this.food_Name5 = food_Name5;
        this.foodperson1 = foodperson1;
        this.foodperson2 = foodperson2;
        this.foodperson3 = foodperson3;
        this.foodperson4 = foodperson4;
        this.foodperson5 = foodperson5;
        this.foodtime = foodtime;
    }
    //    public Food toFood(){
//        return Food.builder()
//                .food_Name1(this.food_Name1)
//                .food_Name2(this.food_Name2)
//                .food_Name3(this.food_Name3)
//                .food_Name4(this.food_Name4)
//                .food_Name5(this.food_Name5)
//                .build();
//    }
}
