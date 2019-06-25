package com.example.demo.service.bace;

import com.example.demo.repository.bace.BaceRepository;

public abstract class CustmServiceImpl<DOMAIN, ID> implements CustmService<DOMAIN, ID> {
    private BaceRepository baceRepository;

    protected CustmServiceImpl(BaceRepository baceRepository) {
        this.baceRepository = baceRepository;

    }
}
