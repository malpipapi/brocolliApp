package com.minionz.backend.foodlist.controller;

import com.minionz.backend.foodlist.controller.dto.*;
import com.minionz.backend.foodlist.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/food")
public class FoodController {
    private static final String Food_save_MESSAGE="Food find success";
    private static final String Food_Calculate_SUCCESS_MESSAGE="음식 칼로리계산성공";

    private final FoodService foodService;

    @PostMapping("/myfind")
    @ResponseStatus(HttpStatus.OK)
    public FoodTotalResponseDto myfind(@RequestBody FoodRequestDto foodRequestDto) {
        log.info(Food_Calculate_SUCCESS_MESSAGE);
        return foodService.myfind(foodRequestDto);
    }

//    @GetMapping("/find/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<FoodRequestDto> show(@PathVariable("id") Long id){
//        List<FoodRequestDto> foodResponseDtoList = foodService.show(id);
//        return foodResponseDtoList;
//    }

}
