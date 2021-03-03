package titan.io.ibcsbankapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Slf4j
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DefaultController {
    // home page
    public String getHomePage(){
        return "index.html";
    }
}
