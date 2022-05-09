package com.minionz.backend.foodlist.controller.dto;

import com.minionz.backend.foodlist.domain.FoodList;
import com.minionz.backend.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FoodListRequestDto {

    private String foodListName;

    @Builder
    public FoodListRequestDto(String foodListName) {
        this.foodListName = foodListName;
    }
}
