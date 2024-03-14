package collegeprojects.springproject.controller;

import collegeprojects.springproject.common.DemoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${developer.name}")
    private String developerName;

    @Value("${team.name}")
    private String teamName;
    @Autowired
    private DemoClass demoClass;

    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-my-world")
    public String HelloMyFriend() {
        return "Hello my friend";
    }

    @GetMapping("/inject-properties")
    public String properties() {
        return developerName + " " + teamName;
    }

    @GetMapping("/demo-controller")
    public String demoController() {
        return demoClass.testDemo();
    }
}
