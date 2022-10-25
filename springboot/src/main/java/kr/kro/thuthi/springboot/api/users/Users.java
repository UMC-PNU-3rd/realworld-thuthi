package kr.kro.thuthi.springboot.api.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "users_id")
    private Integer id;

    private String email;
    private String password;
    private String username;
    private String bio;
    private String image;

    public Users(String email, String password, String username, String bio, String image) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.bio = bio;
        this.image = image;
    }
}
