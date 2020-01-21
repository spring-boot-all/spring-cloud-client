package com.wj.springbootclient.controller;

import com.wj.springbootclient.remote.DemoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientIndexController {

    @Autowired
    private DemoRemote demoRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return demoRemote.getPortInfo(name);
    }
}
