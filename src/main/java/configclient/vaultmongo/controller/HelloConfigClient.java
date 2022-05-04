package configclient.vaultmongo.controller;

import configclient.vaultmongo.model.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigClient {

    @Autowired
    AppProperties properties;

    @GetMapping
    public String sayHello() {
        return "Hello Client";
    }

    @GetMapping("/props")
    public String getProps() {
        return properties.toString();
    }
}
