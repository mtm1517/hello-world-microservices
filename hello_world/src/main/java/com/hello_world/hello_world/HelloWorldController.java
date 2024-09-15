package com.hello_world.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @GetMapping("/hello_world")
    public String helloworld()
    {
        RestTemplate template1 = new RestTemplate();
        String hello = template1.getForObject("http://35.192.70.186/hello", String.class);
        String world = template1.getForObject("http://35.238.209.160/world", String.class);

        return hello + " " + world;
    }
}
