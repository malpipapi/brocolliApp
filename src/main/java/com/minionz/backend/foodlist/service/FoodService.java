package com.minionz.backend.foodlist.service;

import com.minionz.backend.common.domain.Message;
import com.minionz.backend.common.exception.NotFoundException;
import com.minionz.backend.foodlist.controller.dto.*;
import com.minionz.backend.foodlist.domain.Food;
import com.minionz.backend.foodlist.domain.FoodList;
import com.minionz.backend.foodlist.domain.FoodListRepository;
import com.minionz.backend.foodlist.domain.FoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class FoodService {
    private static final String Food_Find_Fail_MESSAGE = "음식 찾기 실패";
    private static final String Food_Save_SUCCESS_MESSAGE = "음식 저장 성공";
    private final FoodRepository foodRepository;
    private final FoodListRepository foodListRepository;


    public FoodTotalResponseDto myfind(FoodRequestDto foodRequestDto) {
        String[] food_name = {foodRequestDto.getFood_Name1(), foodRequestDto.getFood_Name2(), foodRequestDto.getFood_Name3(), foodRequestDto.getFood_Name4(), foodRequestDto.getFood_Name5()};
        int[] food_person ={foodRequestDto.getFoodperson1(),foodRequestDto.getFoodperson2(),foodRequestDto.getFoodperson3(),foodRequestDto.getFoodperson4(),foodRequestDto.getFoodperson5()};
        double foodTan = 0;
        double foodDan = 0;
        double foodJi = 0;
        double foodKcal=0;
        FoodList foodList = null;
        List<FoodListResponseDto> foodListResponseDtoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(food_name[i], "")){
                continue;
            }
            foodList =foodListRepository.findFoodListByFoodListName(food_name[i])
                    .orElseThrow(() -> new NotFoundException(Food_Find_Fail_MESSAGE));

            foodTan += foodList.getFoodTan()*food_person[i];
            foodDan += foodList.getFoodDan()*food_person[i];
            foodJi += foodList.getFoodJi()*food_person[i];
            foodKcal += foodList.getFoodKcal()*food_person[i];

            //foodListResponseDtoList.add(new FoodListResponseDto(foodList),);
        }
        return new FoodTotalResponseDto(foodKcal,foodTan,foodDan,foodJi, foodRequestDto.getFoodtime());
    }

//    public List<FoodResponseDto> show(Long id) {
//        Food food = foodRepository.findById(id)
//                .orElseThrow(()-> new NotFoundException(Food_Find_Fail_MESSAGE));
//        List<FoodList> foodLists = food.getFoodLists();
//        return foodLists.stream()
//                .map(foodList -> new FoodResponseDto(foodList))
//                .collect(Collectors.toList());
//    }
}
