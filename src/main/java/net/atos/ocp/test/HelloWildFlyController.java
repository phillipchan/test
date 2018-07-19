package net.atos.ocp.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWildFlyController {
    private static final String URL = "https://2k9ob97826.execute-api.us-east-2.amazonaws.com/default/TestLamda";

    @RequestMapping("hello")
    public String sayHello(){
        return (getMessage());
    }

    private String getMessage() {
        final RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(URL, String.class).getBody();

    }
}