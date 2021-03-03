package titan.io.ibcsbankapi.controller;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import titan.io.ibcsbankapi.model.Client;
import titan.io.ibcsbankapi.service.ClientService;

import java.util.List;

@Slf4j
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    // get all client
    @GetMapping("/clients")
    public List<Client> getAllClient(){
        return clientService.getAllClient();
    }
    // get client by id
    @GetMapping("/client/{id}")
    public Client getClientById(@PathVariable @NotNull int id){
        return clientService.getClientById(id);
    }
    // get client by nid
    @GetMapping("/clientByNid/{nid}")
    public Client getClientByNid(@PathVariable @NotNull int nid){
        return clientService.getClientByNid(nid);
    }
    // post one client
    @PostMapping("client")
    public Client postOneClient(@RequestBody @NotNull Client client){
        return clientService.postOneClient(client);
    }
    // post all client
    @PostMapping("clients")
    public List<Client> postAllClient(@RequestBody @NotNull List<Client> clientList){
        return clientService.postAllClient(clientList);
    }
    // delete client by id
    @DeleteMapping("/client/{id}")
    public String deleteClientById(@PathVariable @NotNull int id){
        return clientService.deleteClientById(id);
    }
    // delete client by obj
    @DeleteMapping("/client")
    public String deleteClientByObj(@RequestBody @NotNull Client client){
        return clientService.deleteClientByObj(client);
    }
    // update client by obj
    @PutMapping("/client")
    public Client updateClientByObj(@RequestBody @NotNull Client client){
        return clientService.updateClientByObj(client);
    }
}
