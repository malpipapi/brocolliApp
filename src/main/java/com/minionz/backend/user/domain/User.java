package com.minionz.backend.user.domain;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "user_id")),
        @AttributeOverride(name = "name", column = @Column(name = "user_name"))
})
@Entity
public class User extends UserBaseEntity {

    @Column(nullable = false)
    private String age;

    @Builder
    public User(Long id,String name, String email, String password,String weight, String height, String gender,String age) {
        super(id,name, email, password,weight,height,gender);
        this.age =age;
    }
}
