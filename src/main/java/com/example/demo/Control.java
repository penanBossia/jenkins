package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author penaboss
 */


@RestController
public class Control {


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
