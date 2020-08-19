package org.happypanda.mongo_producer.services;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.happypanda.mongo_producer.cdi.MongoClientProducer;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class DbService {

    @Inject
    @MongoClientProducer
    MongoClient client;


    public List<Document> findAllDocuments() {
        MongoCollection<Document> collection = client.getDatabase("test").getCollection("dummy");
        List<Document> docs = collection.find().into(new ArrayList<Document>());
        return docs;
    }
}
