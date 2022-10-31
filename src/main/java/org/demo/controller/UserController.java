package org.demo.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.demo.entity.User;


@Path("/api/v1/user")
public class UserController {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> users() {
        return User.listAll();
    }

	@Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newFruit(User user) {
		user.id = null;
		user.persist();
        return Response.status(Status.CREATED).entity(user).build();
    }	
	
}
