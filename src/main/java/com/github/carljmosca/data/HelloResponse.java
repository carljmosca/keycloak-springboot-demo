package com.github.carljmosca.data;

import java.util.concurrent.atomic.AtomicLong;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moscac
 */
public class HelloResponse {
    
    private String greeting;
    private long id;

    public HelloResponse() {
        
    }

    public HelloResponse(String name, long id) {
        this.greeting = name;
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
}
