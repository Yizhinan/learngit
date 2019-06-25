package com.example.demo.repository.bace;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaceRepository<DOMAIN, ID>extends JpaRepository<DOMAIN, ID> {

}
