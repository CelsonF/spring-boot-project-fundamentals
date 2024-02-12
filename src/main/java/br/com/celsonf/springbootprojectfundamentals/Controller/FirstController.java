package br.com.celsonf.springbootprojectfundamentals.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/firstController")
public class FirstController {
    
    @GetMapping("/firstMethod/{id}")
    public String firstMethod(@PathVariable String id) {
        return "This response is using PathVariables " + id;
    }

    @GetMapping("/methodWithQueryParams")
    public String methodWithQueryParams(@RequestParam  String id ) {
        return "The params with method with query params " + id;
    }

    @GetMapping("/methodWithQueryParamsMap")
    public String methodWithQueryParams(@RequestParam Map<String, String> allParams) {
        return "The params with method with query params and using Map " + allParams.entrySet();
    }

    @PostMapping("/methodWithBodyParams")
    public String methodWithBodyParams(@RequestBody Usuario usuario) {
        
        return "methodWithBodyParams " + usuario.username();
    }
    

    /**
     * Usuario
String username     */
    public record Usuario(String username) {
    }
    
}
