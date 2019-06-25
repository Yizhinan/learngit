package com.example.demo.service.impl;

import com.example.demo.pojo.Role;
import com.example.demo.repository.RoleRepositroy;
import com.example.demo.repository.bace.BaceRepository;
import com.example.demo.service.RoleService;
import com.example.demo.service.bace.CustmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends CustmServiceImpl<Role,String> implements RoleService {
    @Autowired
    private RoleRepositroy roleRepositroy;

    protected RoleServiceImpl(BaceRepository roleRepositroy) {
        super(roleRepositroy);
    }

    @Override
    public Role findRoleByRoleId(Long id) {
       Role role= roleRepositroy.findRoleByRoleId(id);
        return role;
    }
}
