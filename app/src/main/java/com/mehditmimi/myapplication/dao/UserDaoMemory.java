package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.models.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao{
    private List<User> users;

    public UserDaoMemory(){
        users= new Vector<>();
        users.add(new User("fatimzehra@gmail.com","salut","faty",12345));
        users.add(new User("fatim@gmail.com","salut","fatim",1234));
        users.add(new User("zehra@gmail.com","salut","zehra",1234));
    }
    @Override
    public User get(String login) {
        for(User u:users)
            if(u.getEmail().equals(login))
                return u;
        return null;
    }
}
