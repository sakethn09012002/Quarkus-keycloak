package com.example.kyc.resource;

import com.example.kyc.entity.WebServiceStatusEntity;
import com.example.kyc.service.WebServiceStatusService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

import jakarta.annotation.security.RolesAllowed;

@Path("api/kyc")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WebServiceStatusResource {

    private static final Logger logger = Logger.getLogger(WebServiceStatusResource.class.getName());
    @Inject
    WebServiceStatusService service;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<WebServiceStatusEntity> getAll() {
        logger.info("admin user called");
        return service.getAll();
    }

    @GET
    @Path("/{id}")
    @RolesAllowed({"admin", "user"})
    public WebServiceStatusEntity getById(@PathParam("id") String id) {
        logger.info("admin user called and normal user called");

        return service.getById(id);
    }

    @GET
    @Path("/hello")
    public String hello() {
        logger.info("hello world called");

        return "Hello World";
    }
}
