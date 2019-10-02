package com.in28minutes.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
    
    @GetMapping(path="hello-world/path-variable/{name}")
    public HelloWorld helloWorld(@PathVariable String name) {
        return new HelloWorld(String.format("Hello World, %s",name));
    }
}
