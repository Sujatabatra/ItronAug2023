package com.sujata.service;

import com.sujata.entity.User;
import com.sujata.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User loginUser(User user) {
        try {
            return userDao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        }
        catch (Exception exception){
            return null;
        }
    }
}
