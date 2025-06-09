package com.example.kyc.resource;

import com.example.kyc.entity.Web_Service_Status_Entity;
import com.example.kyc.service.Web_Service_Status_Service;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

import jakarta.annotation.security.RolesAllowed;

@Path("api/kyc")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Web_Service_Status_Resource {

    private static final Logger logger = Logger.getLogger(Web_Service_Status_Resource.class.getName());
    @Inject
    Web_Service_Status_Service service;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Web_Service_Status_Entity> getAll() {
        logger.info("admin user called");
        return service.getAll();
    }

    @GET
    @Path("/{id}")
    @RolesAllowed({"admin", "user"})
    public Web_Service_Status_Entity getById(@PathParam("id") String id) {
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
