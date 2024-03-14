package collegeprojects.springproject.common;

import org.springframework.stereotype.Component;

@Component
public class DemoClass implements DemoInterface{
    @Override
    public String testDemo() {
        return "demo class is here";
    }
}
