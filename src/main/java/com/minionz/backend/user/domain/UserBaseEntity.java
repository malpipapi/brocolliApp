package com.minionz.backend.user.domain;

import com.minionz.backend.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public class UserBaseEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String weight;

    @Column(nullable = false)
    private String height;

    @Column(nullable = false)
    private String gender;



    public UserBaseEntity(Long id, String name, String email, String password,String weight,String height,String gender) {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.weight=weight;
        this.height=height;
        this.gender=gender;
    }
}
