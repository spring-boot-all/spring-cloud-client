package com.wj.springbootclient.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-server-1",fallback = DemoRemoteHystrixImpl.class)
public interface DemoRemote {

    @GetMapping("/getPortInfo")
    String getPortInfo(@RequestParam String name);

}
