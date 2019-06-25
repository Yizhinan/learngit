package com.example.demo.service;

import com.example.demo.pojo.Role;
import com.example.demo.service.bace.CustmService;

public interface RoleService extends CustmService<Role,String> {
    public Role findRoleByRoleId (Long id);

}
