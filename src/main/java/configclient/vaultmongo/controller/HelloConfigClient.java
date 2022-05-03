package configclient.vaultmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigClient {

    @GetMapping
    public String sayHello(){
        return "Hello Client";
    }
}
