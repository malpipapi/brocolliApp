package com.minionz.backend.foodlist.controller.dto;

import com.minionz.backend.common.domain.Message;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class FoodSaveResponseDto {

    private Long id;
    private String message;

    public FoodSaveResponseDto(Long id, Message message){
        this.id=id;
        this.message=message.getMessage();
    }
}
