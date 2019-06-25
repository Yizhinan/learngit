package com.example.demo.Web.contruller;

import com.example.demo.Web.api.HelloRemote;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api("测试api")
@RestController
@RequestMapping("/Api")
public class RestConsumerController {

    @Autowired
    private  HelloRemote HelloRemote;
    @Autowired
    private UserService userService;
@ApiOperation("远程调用接口方法")
    @RequestMapping(value="/hello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable(name="name")String name) {
        return HelloRemote.hello(name);
    }
    @ApiOperation("根据id查用户")
    @RequestMapping(value = "/finduserById",method = RequestMethod.GET)
    public User findUserbyId(Integer id){
        System.out.println(id);
        User user=userService.findUserById(id);
        System.out.println(user);
        return userService.findUserById(id);
    }


}