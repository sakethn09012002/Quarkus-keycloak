package com.example.kyc.service;


import com.example.kyc.entity.Web_Service_Status_Entity;
import com.example.kyc.repository.Web_Service_Status_Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class Web_Service_Status_Service {

    @Inject
    Web_Service_Status_Repository Web_Service_Status_Repository;

    public List<Web_Service_Status_Entity> getAll() {
        return Web_Service_Status_Repository.listAll();
    }

    public Web_Service_Status_Entity getById(String uuid) {
        return Web_Service_Status_Repository.find("uuid", uuid).firstResult();
    }

}
