package kr.kro.thuthi.springboot.api.users;

import kr.kro.thuthi.springboot.api.users.Users;
import kr.kro.thuthi.springboot.api.users.dto.PostUserReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public void save(Users user) {
        em.persist(user);
    }
}
