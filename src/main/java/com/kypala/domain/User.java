package com.kypala.domain;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
public class User {
    private Long id;
    private String userName;
    private LocalDate userDateOfBirth;
    private LocalDate userDateOfCreation;
    private String userPhoto;
    private String userSex;
    private String userCurrentTown;
    private String userEmailAddress;
    private String userPhoneNumber;
    private List<Long> watchedUsers;


}
