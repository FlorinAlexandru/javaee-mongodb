package org.happypanda.mongo_producer;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import javax.ejb.Startup;


@Singleton
@Startup
public class EntryPoint {

    @PostConstruct
    private void init() {
        System.out.println("Hello Burgi! Lets get going");
    }
}
