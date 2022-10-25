package kr.kro.thuthi.springboot.api.users;

import kr.kro.thuthi.springboot.api.users.dto.PostUserReq;
import kr.kro.thuthi.springboot.api.users.dto.PostUserRes;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public PostUserRes saveUser(PostUserReq postUserReq) {
        Users user = new Users(
                postUserReq.getEmail(),
                passwordEncoder.encode(postUserReq.getPassword()),
                postUserReq.getUsername(),
                "My name is " + postUserReq.getUsername(),
                "https://myImage" + postUserReq.getUsername()
        );

        userRepository.save(user);

        return new PostUserRes(
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getBio(),
                user.getImage()
        );
    }
}
