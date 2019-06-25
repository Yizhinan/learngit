package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.service.bace.CustmService;

public interface UserService extends CustmService<User,Integer> {
    public User findUserById(Integer id);
    public void save(User user);
    public User findUserByUser_nameAndPassworld(String user_name,String passworld);

}
