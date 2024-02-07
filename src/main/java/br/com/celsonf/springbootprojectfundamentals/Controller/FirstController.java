package br.com.celsonf.springbootprojectfundamentals.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/firstController")
public class FirstController {
    
    @GetMapping("/firstMethod/{id}")
    public String firstMethod(@PathVariable String id) {
        return "This response is using PathVariables" + id;
    }

    @GetMapping("/secondMethod/{name}")
    public String secondMethod(@PathVariable(name = "id") String id) {
        return "This response is using PathVariables and named item in path variable." + id;
    }


    
}
