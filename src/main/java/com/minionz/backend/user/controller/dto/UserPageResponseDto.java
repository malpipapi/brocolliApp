package com.minionz.backend.user.controller.dto;

import com.minionz.backend.user.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserPageResponseDto extends MyPageResponseDto{


    public UserPageResponseDto(User user){
        super(user.getAge(),user.getName(), user.getHeight(),user.getWeight(), user.getGender());
    }
}
