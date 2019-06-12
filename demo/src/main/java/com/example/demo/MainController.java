package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//provides hints for Spring that the class plays a specific role. Our class is a web @Controller so Spring considers it when handling incoming web requests.
@RestController

public class MainController {

    //annotation that provides "routing" info. Tells spring that any http request with "/" path should be mapped to the home() method.
    @GetMapping("/")
    // Because of restcontroller annotation spring renders resulting string directly back to the called. In this case caller is home method and string is returned
    public String home(){
        return "Hello comma World!";
    }
}
