package com.pvsoul.demobackend.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Slf4j
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HelloPvsoulResouce {

    @GET
    @Path("hellopvsoul")
    public Response HelloPvsoul() {
        return Response.status(Response.Status.OK).entity("Hello Pvsoul").build();
    }
}
