package com.minionz.backend.calendar.domain;

import com.minionz.backend.common.domain.BaseEntity;
import com.minionz.backend.foodlist.domain.FoodList;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "calendar_id"))
})
@Entity
public class Calendar extends BaseEntity {
    @Column
    private double sumFoodKcal;

    @Column
    private double sumFoodTan;

    @Column
    private double sumFoodDan;

    @Column
    private double sumFoodJi;

    @Column
    private String foodTime;

    @Column
    private String foodDate;

    @Builder
    public Calendar(Long id, double sumFoodKcal, double sumFoodTan, double sumFoodDan, double sumFoodJi,String foodTime) {
        super(id);
        this.sumFoodKcal = sumFoodKcal;
        this.sumFoodTan = sumFoodTan;
        this.sumFoodDan = sumFoodDan;
        this.sumFoodJi = sumFoodJi;
        this.foodTime =foodTime;
    }
}
