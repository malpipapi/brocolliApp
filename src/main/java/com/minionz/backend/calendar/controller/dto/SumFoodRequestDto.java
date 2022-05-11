package com.minionz.backend.calendar.controller.dto;

import com.minionz.backend.calendar.domain.Calendar;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SumFoodRequestDto {
    private double sumFoodKcal;
    private double sumFoodTan;
    private double sumFoodDan;
    private double sumFoodJi;
    private String foodTime;

    @Builder
    public SumFoodRequestDto(double sumFoodKcal, double sumFoodTan, double sumFoodDan, double sumFoodJi,String foodTime) {
        this.sumFoodKcal = sumFoodKcal;
        this.sumFoodTan = sumFoodTan;
        this.sumFoodDan = sumFoodDan;
        this.sumFoodJi = sumFoodJi;
        this.foodTime =foodTime;
    }

    public Calendar toCalendar() {
        return Calendar.builder()
                .sumFoodDan(this.sumFoodDan)
                .sumFoodJi(this.sumFoodJi)
                .sumFoodKcal(this.sumFoodKcal)
                .sumFoodTan(this.sumFoodTan)
                .foodTime(this.foodTime)
                .build();
    }
}
