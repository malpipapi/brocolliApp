package com.minionz.backend.user.controller.dto;

import com.minionz.backend.user.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@NoArgsConstructor
public class JoinRequestDto {

    private String name;
    private String email;
    private String age;
    private String password;
    private String weight;
    private String height;
    private String gender;

    @Builder
    public JoinRequestDto(String name, String email, String age,String password,String weight,String height,String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.gender =gender;
    }

    public User toUser(PasswordEncoder passwordEncoder) {
        return User.builder()
                .name(this.name)
                .age(this.age)
                .password(passwordEncoder.encode(this.password))
                .email(this.email)
                .weight(this.weight)
                .height(this.height)
                .gender(this.gender)
                .build();
    }
}
