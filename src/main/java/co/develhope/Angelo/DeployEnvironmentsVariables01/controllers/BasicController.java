package co.develhope.Angelo.DeployEnvironmentsVariables01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String greeting(){
        String authCode = environment.getProperty("myCustomProps.authCode");
        String devName = environment.getProperty("myCustomProps.devName");
        return "Hello User! AuthCode: " + authCode + " devName: " + devName;
    }
}
