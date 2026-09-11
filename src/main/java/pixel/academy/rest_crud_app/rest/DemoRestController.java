package pixel.academy.rest_crud_app.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoRestController {

    //adaugam  codul pentru endpoint-ul /hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
