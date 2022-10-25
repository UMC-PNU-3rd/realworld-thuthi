package kr.kro.thuthi.springboot.api.users.dto;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@ToString
public class PostUserReq {
    @NotEmpty
    private String username;
    @Email
    private String email;
    @NotEmpty
    @Min(6)
    @Max(12)
    private String password;
}
