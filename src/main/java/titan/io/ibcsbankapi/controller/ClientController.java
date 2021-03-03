package titan.io.ibcsbankapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import titan.io.ibcsbankapi.service.ClientService;

@Slf4j
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;


}
