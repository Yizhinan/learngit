package com.example.demo.repository.bace;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class BaceReposiroryImpl<DOMAIN, ID> extends SimpleJpaRepository<DOMAIN, ID> implements BaceRepository<DOMAIN, ID> {

    public BaceReposiroryImpl(JpaEntityInformation<DOMAIN, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }
}
