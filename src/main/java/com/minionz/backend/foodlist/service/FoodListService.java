package com.minionz.backend.foodlist.service;


import com.minionz.backend.common.exception.NotFoundException;
import com.minionz.backend.foodlist.controller.dto.FoodListRequestDto;
import com.minionz.backend.foodlist.controller.dto.FoodListResponseDto;
import com.minionz.backend.foodlist.domain.FoodList;
import com.minionz.backend.foodlist.domain.FoodListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class FoodListService {

//    private static final String FOODLIST_FIND_FAIL_MESSAGE = "음식 찾기 실패입니다";
//
//    private final FoodListRepository foodListRepository;
//
//    @Transactional
//    public FoodListResponseDto find(FoodListRequestDto foodListRequestDto) {
//        FoodList foodList = foodListRepository.findFoodListByFoodListName(foodListRequestDto.getFoodListName())
//                .orElseThrow(() -> new NotFoundException(FOODLIST_FIND_FAIL_MESSAGE));
//        return new FoodListResponseDto(foodList);
//    }
}