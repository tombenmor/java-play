package org.tbm.javaplay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        System.out.println("Received GET on \"/\"");
        return "Hihihi there";
    }

}