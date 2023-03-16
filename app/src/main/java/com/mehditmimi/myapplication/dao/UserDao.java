package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.models.User;

public interface UserDao {
    User get(String login);
}
