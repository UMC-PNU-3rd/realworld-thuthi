package kr.kro.thuthi.springboot.api.users;

import kr.kro.thuthi.springboot.api.users.dto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(("/api/users"))
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    @PostMapping("")
    public ResponseEntity<BasicUserDto<PostUserRes>> postUser(
            @Valid @RequestBody BasicUserDto<PostUserReq> postUserReq
    ) {
        log.debug("UserController.postUser");
        PostUserRes postUserRes = userService.saveUser(postUserReq.getUser());
        return ResponseEntity.ok(new BasicUserDto<>(postUserRes));
    }
}
