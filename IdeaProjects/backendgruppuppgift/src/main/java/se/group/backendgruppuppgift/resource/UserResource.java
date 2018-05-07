package se.group.backendgruppuppgift.resource;

import org.springframework.stereotype.Component;
import se.group.backendgruppuppgift.data.User;
import se.group.backendgruppuppgift.service.UserService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.CREATED;

@Component
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Path("users")
public class UserResource {

    private final UserService service;

    @Context
    private UriInfo uriInfo;

    public UserResource(UserService service) {
        this.service = service;
    }

    @POST
    public Response createUser(User user) {
        User result = service.createUser(user);
        return Response.status(CREATED).header("Location", "users/" + result.getId()).build();
    }

}
