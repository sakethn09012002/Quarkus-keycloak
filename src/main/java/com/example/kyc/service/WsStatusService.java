package com.example.kyc.service;


import com.example.kyc.entity.WsStatus;
import com.example.kyc.repository.WsStatusRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class WsStatusService {

    @Inject
    WsStatusRepository WsStatusRepository;

    public List<WsStatus> getAll() {
        return WsStatusRepository.listAll();
    }

    public WsStatus getById(String uuid) {
        return WsStatusRepository.find("uuid", uuid).firstResult();
    }
}

