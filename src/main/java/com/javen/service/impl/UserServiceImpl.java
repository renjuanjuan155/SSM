package com.javen.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.mapper.UserMapper;
import com.javen.model.User;
import com.javen.service.IUserService;
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Autowired
    private UserMapper userDao;
    
    public User getUserById(int userId) {  

        User user = this.userDao.selectByPrimaryKey(userId);

        return user;
    }  
  
}  
