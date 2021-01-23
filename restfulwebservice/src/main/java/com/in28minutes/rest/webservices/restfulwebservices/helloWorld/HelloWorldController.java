package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworldbean")
    public HelloWorld getHelloWorldBean(){
        return new HelloWorld("Hello World Bean");
    }

    @GetMapping("/helloworldbean/path-varriable/{name}")
    public HelloWorld getHelloWorldBeanWithPathVariable(@PathVariable  String name){
        return new HelloWorld(String.format("Hello World %s",name));
    }


}
