package com.example.kyc.repository;


import com.example.kyc.entity.WebServiceStatusEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WebServiceStatusRepository implements PanacheRepository<WebServiceStatusEntity> {
}
