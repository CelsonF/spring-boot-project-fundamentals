package br.com.celsonf.springbootprojectfundamentals.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/firstController")
public class FirstController {
    
    @GetMapping("/")
    public String getMethodName() {
        System.out.println("Estou funcionando");
        return "Estou funcionando";
    }
    
}
