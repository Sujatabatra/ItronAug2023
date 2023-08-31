package com.sujata.persistence;

import com.sujata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User,String> {

    public User findUserByUsernameAndPassword(String username,String password);
}
