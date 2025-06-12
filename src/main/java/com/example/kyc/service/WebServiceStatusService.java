package com.example.kyc.service;


import com.example.kyc.entity.WebServiceStatusEntity;
import com.example.kyc.repository.WebServiceStatusRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class WebServiceStatusService {

    @Inject
    WebServiceStatusRepository WebServiceStatusRepository;

    public List<WebServiceStatusEntity> getAll() {
        return WebServiceStatusRepository.listAll();
    }

    public WebServiceStatusEntity getById(String uuid) {
        return WebServiceStatusRepository.find("uuid", uuid).firstResult();
    }

}
