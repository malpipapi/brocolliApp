package com.minionz.backend.foodlist.controller;

import com.minionz.backend.foodlist.controller.dto.FoodListRequestDto;
import com.minionz.backend.foodlist.controller.dto.FoodListResponseDto;
import com.minionz.backend.foodlist.domain.FoodListRepository;
import com.minionz.backend.foodlist.service.FoodListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/foodlist")
public class FoodListController {
//    private static final String FoodList_Find_MESSAGE="Food find success";
//
//    private final FoodListRepository foodListRepository;
//    @Autowired
//    private final FoodListService foodListService;
//
//    @GetMapping("/find")
//    @ResponseStatus(HttpStatus.OK)
//    public FoodListResponseDto show(@RequestBody FoodListRequestDto foodListRequestDto) {
//        log.info(FoodList_Find_MESSAGE);
//        return foodListService.find(foodListRequestDto);
//    }
}
