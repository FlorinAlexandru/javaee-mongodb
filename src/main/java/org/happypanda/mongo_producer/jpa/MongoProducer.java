package org.happypanda.mongo_producer.jpa;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.happypanda.mongo_producer.cdi.MongoClientProducer;
import org.happypanda.mongo_producer.cdi.Property;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class MongoProducer {

    @Inject
    @Property(value = "mongodb.uri")
    private String mongoUri;

    @Inject
    @Property(value = "mongodb.port")
    private int mongoPort;

    @Produces
    @MongoClientProducer
    public MongoClient getMongoClient() {
        return new MongoClient(new ServerAddress(mongoUri, mongoPort));
    }
}
