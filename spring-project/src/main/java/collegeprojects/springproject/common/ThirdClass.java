package collegeprojects.springproject.common;

import org.springframework.stereotype.Component;

@Component
public class ThirdClass implements MainInterface{
    @Override
    public String testQualifier() {
        return "ThirdClass";
    }
}
