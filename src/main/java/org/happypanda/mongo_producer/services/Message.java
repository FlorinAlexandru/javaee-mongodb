package org.happypanda.mongo_producer.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private int id;

    private String content;

    public Message() {
    }

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
