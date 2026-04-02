package br.edu.atitus.greetingservice.controllers;


import br.edu.atitus.greetingservice.configs.GreetingConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import br.edu.atitus.greetingservice.dto.GreetingRequest;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

//    @Value("${greeting-service.greeting}")
//    private String greeting;
//
//    @Value("${greeting-service.default-name}")
//    private String defaultName;

    private final GreetingConfig config;
    //Injeção de dependência -
    public GreetingController(GreetingConfig config) {
        this.config = config;
    }

    @GetMapping({"", "/"})
    public String getGreeting(@RequestParam(required = false) String name) {
        if (name == null || name.isEmpty()) {
            name = config.getDefaultName();
        }
        return String.format("%s %s!!!", config.getGreeting(), name);
    }

    @GetMapping("/{name}")
    public String getGreetingByPath(@PathVariable String name) {
        if (name == null || name.isEmpty()) {
            name = config.getDefaultName();
        }
        return String.format("%s, %s!!!", config.getGreeting(), name);
    }

    @PostMapping({"", "/"})
    public String postGreetingSimple(@RequestBody GreetingRequest request) {

        String name = request.getName();

        if (name == null || name.isEmpty()) {
            name = config.getDefaultName();
        }

        return String.format("%s, %s!!!", config.getGreeting(), name);
    }
}