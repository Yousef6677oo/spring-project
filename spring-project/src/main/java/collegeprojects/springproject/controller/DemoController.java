package collegeprojects.springproject.controller;

import collegeprojects.springproject.common.DemoClass;
import collegeprojects.springproject.common.FirstClass;
import collegeprojects.springproject.common.MainInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    DemoController(@Qualifier("firstClass") MainInterface mainInterface){
        System.out.println(mainInterface.testQualifier());
    }
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

    @GetMapping("/test-qualifier")
    public String demoQualifier() {
        return demoClass.testDemo();
    }
}
