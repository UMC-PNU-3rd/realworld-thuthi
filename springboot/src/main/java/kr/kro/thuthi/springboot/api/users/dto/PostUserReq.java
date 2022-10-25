package kr.kro.thuthi.springboot.api.users.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PostUserReq {
    private String username;
    private String email;
    private String password;
}
