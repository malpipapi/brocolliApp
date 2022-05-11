package com.minionz.backend.foodlist.domain;

import com.minionz.backend.common.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "foodList_Id"))
})
@Entity
public class FoodList extends BaseEntity {

    @Column
    private String foodListName;

    @Column
    private double foodKcal;

    @Column
    private double foodTan;

    @Column
    private double foodDan;

    @Column
    private double foodJi;


    @Builder
    public FoodList(Long id, String foodListName, double foodKcal, double foodTan, double foodDan, double foodJi) {
        super(id);
        this.foodListName = foodListName;
        this.foodKcal = foodKcal;
        this.foodTan = foodTan;
        this.foodDan = foodDan;
        this.foodJi = foodJi;
    }
}
