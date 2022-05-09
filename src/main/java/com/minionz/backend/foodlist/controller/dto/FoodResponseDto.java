package com.minionz.backend.foodlist.controller.dto;

public class FoodResponseDto {
    private String food_Name1;
    private String food_Name2;
    private String food_Name3;
    private String food_Name4;
    private String food_Name5;

    public FoodResponseDto(String food_Name1, String food_Name2, String food_Name3, String food_Name4, String food_Name5) {
        this.food_Name1 = food_Name1;
        this.food_Name2 = food_Name2;
        this.food_Name3 = food_Name3;
        this.food_Name4 = food_Name4;
        this.food_Name5 = food_Name5;
    }

}
