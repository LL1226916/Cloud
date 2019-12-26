package com.blb.controller;

import com.blb.pojo.UserInfo;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("customer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

//    @GetMapping("/{i}")
//    public UserInfo getUser(@PathVariable("i") Long i){
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        ServiceInstance serviceInstance = instances.get(0);
//        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+i;
//        UserInfo user = restTemplate.getForObject(url, UserInfo.class);
//        return user;
//    }

    @GetMapping("/{i}")
    public UserInfo getUser(@PathVariable("i") Long i){
        String url="http://user-service/user/"+i;
        UserInfo user = restTemplate.getForObject(url, UserInfo.class);
        return user;
    }
}
