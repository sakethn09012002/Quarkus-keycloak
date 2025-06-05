package com.example.kyc.repository;


import com.example.kyc.entity.WsStatus;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WsStatusRepository implements PanacheRepository<WsStatus> {
}
