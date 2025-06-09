package com.example.kyc.repository;


import com.example.kyc.entity.Web_Service_Status_Entity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Web_Service_Status_Repository implements PanacheRepository<Web_Service_Status_Entity> {
}
