package br.com.celsonf.springbootprojectfundamentals.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;



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
        
        return "The method with Body Params " + usuario.username();
    }

    @PostMapping("/methodWithHeaders")
    public String methodWithHeaders(@RequestHeader("name") String name) {
        
        return "Methods with headers " + name;
    
    }
    @PostMapping("/methodWithListHeaders")
    public String methodWithListHeaders(@RequestHeader Map<String,String> headers) {
        
        return "Methods with list of headers " + headers.entrySet();
    }
    
    /**
     * Usuario
     * String username    
     * Testando o comentário para documentação 
    */
    public record Usuario(String username) {
    }
    
}
