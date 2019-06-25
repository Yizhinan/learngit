package com.example.demo.repository;

import com.example.demo.pojo.Role;
import com.example.demo.repository.bace.BaceRepository;

public interface RoleRepositroy extends BaceRepository<Role,String> {
    public Role findRoleByRoleId (Long id);
}
