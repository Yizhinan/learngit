package com.example.demo.repository;

import com.example.demo.pojo.User;
import com.example.demo.repository.bace.BaceRepository;

public interface UserRepository extends BaceRepository<User, Integer> {
    public User findUserById(Integer id);
    public User findUserByUserNameAndUserPass(String userName,String passworld);


}
