package io.java.springbootquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by priyankthakkar on 6/9/17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
