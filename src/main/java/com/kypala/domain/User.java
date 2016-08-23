package com.kypala.domain;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
public class User {
    private Long id;
    private String userName;
    private LocalDateTime userDateOfBirth;
    private LocalDateTime userDateOfApointment;
    private String userPhoto;
    private String userSex;
    private String userCurrentTown;
    private String userEmailAddress;
    private String userPhoneNumber;
    private List watchedUsers;


}
