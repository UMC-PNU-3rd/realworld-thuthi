package kr.kro.thuthi.springboot.api.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PostUserRes {
    private String username;
    private String email;
    private String password;
    private String bio;
    private String image;
}
