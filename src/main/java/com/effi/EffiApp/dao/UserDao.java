package com.effi.EffiApp.dao;

import com.effi.EffiApp.entity.User;

public interface UserDao {
    User findUserByEmail(String email);
}