/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.controller;

import com.github.carljmosca.data.HelloResponse;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author moscac
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    private static final String GREETING_TEMPLATE = "Hello, %s %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    HelloResponse sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        return new HelloResponse(String.format(GREETING_TEMPLATE, name, "Test"), // auth.getName()), 
                counter.incrementAndGet());
    }
}
