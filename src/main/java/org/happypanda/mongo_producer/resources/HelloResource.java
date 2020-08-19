package org.happypanda.mongo_producer.resources;

import org.bson.Document;
import org.happypanda.mongo_producer.cdi.Property;
import org.happypanda.mongo_producer.services.DbService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestScoped
@Path("/hello")
public class HelloResource {

    @Inject
    DbService service;

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello() {
        List<Document> result = service.findAllDocuments();
        System.out.println(result.size());
        return "Hello Burgilica: " + result.get(0).get("x");
    }
}
