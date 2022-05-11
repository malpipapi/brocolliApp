package com.minionz.backend.user.service;

import com.minionz.backend.common.domain.Message;
import com.minionz.backend.common.exception.BadRequestException;
import com.minionz.backend.common.exception.NotEqualsException;
import com.minionz.backend.common.exception.NotFoundException;
import com.minionz.backend.user.controller.dto.*;
import com.minionz.backend.user.domain.User;
import com.minionz.backend.user.domain.UserBaseEntity;
import com.minionz.backend.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private static final String LOGOUT_SUCCESS_MESSAGE = "로그아웃 성공";
    private static final String SIGN_UP_SUCCESS_MESSAGE = "회원가입 성공";
    private static final String LOGIN_SUCCESS_MESSAGE = "로그인 성공";
    private static final String WITHDRAW_SUCCESS_MESSAGE = "회원탈퇴 성공";
    private static final String ADD_BOOKMARK_SUCCESS_MESSAGE = "즐겨찾기 추가 성공";
    private static final String DELETE_BOOKMARK_SUCCESS_MESSAGE = "즐겨찾기 삭제 성공";
    private static final String USER_NOT_FOUND_MESSAGE = "해당 유저가 존재하지 않습니다.";
    private static final String PASSWORD_NOT_EQUALS_MESSAGE = "비밀번호가 일치하지 않습니다.";
    private static final String USER_DUPLICATION_MESSAGE = "해당 유저 이메일이 중복입니다.";
    private static final String USER_age_DUPLICATION_MESSAGE = "해당 유저 닉네임이 중복입니다.";
    private static final String SHOP_NOT_FOUND_MESSAGE = "해당 매장이 존재하지 않습니다.";
    private static final String MY_PAGE_CHANGE_SUCCESS = "해당 유저 회원정보 수정 성공입니다";

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional(readOnly = true)
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        User findUser = userRepository.findByEmail(loginRequestDto.getEmail())
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_MESSAGE));
        validatePassword(loginRequestDto, findUser.getPassword());
        return new LoginResponseDto(findUser.getId(), new Message(LOGIN_SUCCESS_MESSAGE));
    }

    @Transactional(readOnly = true)
    public Message logout(Long id) {
        userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_MESSAGE));
        return new Message(LOGOUT_SUCCESS_MESSAGE);
    }

    @Transactional
    public Message signUp(JoinRequestDto joinRequestDto) {
        checkDuplicateEmail(joinRequestDto.getEmail());
        checkDuplicateage(joinRequestDto.getAge());
        User user = joinRequestDto.toUser(passwordEncoder);
        userRepository.save(user);
        return new Message(SIGN_UP_SUCCESS_MESSAGE);
    }

    @Transactional
    public Message withdraw(Long id) {
        User user = findUserById(id);
        userRepository.delete(user);
        return new Message(WITHDRAW_SUCCESS_MESSAGE);
    }

    @Transactional(readOnly = true)
    public UserPageResponseDto viewMyPage(Long id) {
        User user = findUserById(id);
        return new UserPageResponseDto(user);
    }
    private User findUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_MESSAGE));
    }

    private void validatePassword(LoginRequestDto loginRequestDto, String password) {
        if (!passwordEncoder.matches(loginRequestDto.getPassword(), password)) {
            throw new NotEqualsException(PASSWORD_NOT_EQUALS_MESSAGE);
        }
    }

    private void checkDuplicateEmail(String email) {
        if (userRepository.existsByEmail(email)) {
            throw new BadRequestException(USER_DUPLICATION_MESSAGE);
        }
    }

    private void checkDuplicateage(String age) {
        if (userRepository.existsByage(age)) {
            throw new BadRequestException(USER_age_DUPLICATION_MESSAGE);
        }
    }

    public Message change(Long id,UserChangeRequestDto userChangeRequestDto) {
        User changeUser = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_MESSAGE));
        changeUser.setName(userChangeRequestDto.getName());
        changeUser.setHeight(userChangeRequestDto.getHeight());
        changeUser.setWeight(userChangeRequestDto.getWeight());
        changeUser.setGender(userChangeRequestDto.getGender());
        changeUser.setAge(userChangeRequestDto.getAge());
        userRepository.save(changeUser);
        return new Message(MY_PAGE_CHANGE_SUCCESS);

    }
}
