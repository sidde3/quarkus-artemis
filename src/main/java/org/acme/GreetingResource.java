package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.jms.Consumer;

@Path("/price")
public class GreetingResource {

    @Inject
    Consumer consumer;

    @GET
    @Path("last")
    @Produces(MediaType.TEXT_PLAIN)
    public String last() {
        System.err.println("Got last");
        return consumer.getLastPrice();
    }
}
