package com.example.kyc.service;


import com.example.kyc.entity.WsStatus;
import com.example.kyc.repository.repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class WsStatusService {

    @Inject
    repository repository;

    public List<WsStatus> getAll() {
        return repository.listAll();
    }

    public WsStatus getById(String uuid) {
        return repository.find("uuid", uuid).firstResult();
    }
}

