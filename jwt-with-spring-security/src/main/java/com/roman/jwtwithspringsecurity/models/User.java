package com.roman.jwtwithspringsecurity.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String usrId;
    private String name;
    private String email;
}
