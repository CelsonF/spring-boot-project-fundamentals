package br.com.celsonf.springbootprojectfundamentals.IocDi;

import org.springframework.stereotype.Service;

@Service
public class MyComponent {
    
    public String callMyComponent() {
        return "Call my component";
    }

}
