package com.example.demo.Web.contruller;

import com.example.demo.pojo.JsonResult;
import com.example.demo.pojo.ResultCodeEnum;
import com.example.demo.pojo.Role;
import com.example.demo.pojo.User;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 */
@Api("用户信息管理")
@Controller
@RequestMapping(value = {"/"})
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation("远程调用测试")
   public String admin(Model model){
        model.addAttribute("mode","hello world!!");
       return "admin_index";
   }
   @RequestMapping(value = "/susser",method = RequestMethod.GET)
   @ApiOperation("本地实验测试")
public String susser(Model model){

       model.addAttribute("mode","hello world!!");

        return "b";
}
    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    @ApiOperation("用户登录")
    public String save(Integer id, String user_name, String passworld) {
        System.out.println(id+"==="+user_name+"==="+passworld);
        User user = User.builder().id(id).userName(user_name).userPass(passworld).build();
        System.out.println(user);
        userService.save(user);
        System.out.println(userService.findUserById(id));
        return "admin_index";
    }

    /**
     * 登录验证
     * @param userName
     * @param password
     * @return
     */
      @GetMapping("/login")
      @ResponseBody
      @ApiOperation("登录验证")
      @ApiImplicitParams({
              @ApiImplicitParam(name = "userName",value = "用户账号",dataType="String" ,paramType="query"),
              @ApiImplicitParam(name = "password",value = "用户密码",dataType="String" ,paramType="query")

            })
      public JsonResult login(String userName, String password){
        Long id=1000L;
         Role role= roleService.findRoleByRoleId(id);
          System.out.println(role);
          System.out.println(userName+":"+password);
           User user1 =userService.findUserByUser_nameAndPassworld(userName,password);
         // model.addAttribute("user",user1);
          System.out.println(user1);
           if(user1!=null)
              return new JsonResult(ResultCodeEnum.SUCCESS.getCode(),"登录成功！！",user1);

          return new JsonResult(ResultCodeEnum.FAIL.getCode(),"登录失败！！");
      }
}
