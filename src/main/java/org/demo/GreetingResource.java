package org.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.demo.bean.Message;

@Path("/app/v1")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
       Message message  = new Message(200,"Hello Quarkus work.");
       return Response.status(Status.OK).entity(message).build();
    }
}