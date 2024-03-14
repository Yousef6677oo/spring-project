package collegeprojects.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World!";
    }
}
