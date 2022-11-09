package ruggy.com.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(path = {"ruggy","jarred"},method = {RequestMethod.GET})

    public String ruggy(){
        return "This is Jaston Ruggy";
    }
}
