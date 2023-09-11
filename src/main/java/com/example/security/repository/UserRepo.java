package com.example.security.repository;

import com.example.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

//    @Query(value = "select * from User u where u.email = :email")
//    Optional<User> findUserByEmail(String email);

    Optional<User> findByeMail(String eMail);

}
