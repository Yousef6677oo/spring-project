package collegeprojects.springproject.common;

import org.springframework.stereotype.Component;

@Component
public class SecondClass implements MainInterface{
    @Override
    public String testQualifier() {
        return "SecondClass";
    }
}
