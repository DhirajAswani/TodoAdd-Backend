package com.dhirajapps.rest.restfulwebservices.HelloWorldController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public String helloWorldPathvariable(@PathVariable String name) {
        return "Hello "+name;
//        throw new RuntimeException("Demo Runtime Exception ");
    }
}
