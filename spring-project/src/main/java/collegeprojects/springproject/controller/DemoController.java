package collegeprojects.springproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-my-world")
    public String HelloMyFriend() {
        return "Hello my friend";
    }

    @Value("${developer.name}")
    private String developerName;

    @GetMapping("/inject-properties")
    public String properties() {
        return developerName;
    }
}
