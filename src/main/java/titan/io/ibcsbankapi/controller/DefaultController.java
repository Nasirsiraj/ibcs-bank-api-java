package titan.io.ibcsbankapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class DefaultController {
    // home page
    public String getHomePage(){
        return "index.html";
    }
}
