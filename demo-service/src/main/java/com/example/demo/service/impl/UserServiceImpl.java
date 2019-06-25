package com.example.demo.service.impl;

import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.bace.CustmServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends CustmServiceImpl<User, Integer>  implements UserService {
      private  UserRepository userRepository;
      protected UserServiceImpl(UserRepository userRepository){
          super(userRepository);
          this.userRepository=userRepository;
      }

    /**
     *
     * @param id 用户id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        User user= userRepository.findUserById(id);
        return user;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserByUser_nameAndPassworld(String userName,String passworld) {
        User user=   userRepository.findUserByUserNameAndUserPass(userName,passworld);
        return user;
    }
}
