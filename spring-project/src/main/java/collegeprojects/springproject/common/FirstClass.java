package collegeprojects.springproject.common;

import org.springframework.stereotype.Component;

@Component
public class FirstClass implements MainInterface{
    @Override
    public String testQualifier() {
        return "FirstClass";
    }
}
