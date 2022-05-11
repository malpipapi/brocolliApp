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
        @AttributeOverride(name = "id", column = @Column(name = "food_Id"))
})
@Entity
public class Food extends BaseEntity {

    @Column
    private String food_Name1;

    @Column
    private String food_Name2;

    @Column
    private String food_Name3;

    @Column
    private String food_Name4;

    @Column
    private String food_Name5;



    @Builder
    public Food(Long id, String food_Name1, String food_Name2, String food_Name3, String food_Name4, String food_Name5) {
        super(id);
        this.food_Name1 = food_Name1;
        this.food_Name2 = food_Name2;
        this.food_Name3 = food_Name3;
        this.food_Name4 = food_Name4;
        this.food_Name5 = food_Name5;
    }

}
