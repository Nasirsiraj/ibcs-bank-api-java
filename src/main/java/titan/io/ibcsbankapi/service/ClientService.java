package titan.io.ibcsbankapi.service;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titan.io.ibcsbankapi.model.Client;
import titan.io.ibcsbankapi.repository.ClientRepository;

import java.util.List;

@Slf4j
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    // get all client
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
    // get client by id
    public Client getClientById(@NotNull int id){
        return clientRepository.findById(id).orElse(null);
    }
    // get client by nid
    public Client getClientByNid(@NotNull int nid){
        return clientRepository.findByNid(nid);
    }
    // post one client
    public Client postOneClient(@NotNull Client client){
        Client existingClient = clientRepository.findByNid(client.getNid());
        if(existingClient != null){
            return null;
        }else{
            return clientRepository.save(client);
        }
    }
    // post all client
    public List<Client> postAllClient(@NotNull List<Client> clientList){
        return clientRepository.saveAll(clientList);
    }
    // delete client by id
    public String deleteClientById(@NotNull int id){
        Client existingClient = clientRepository.findById(id).orElse(null);
        if(existingClient == null){
            return "no client found, id: " + id;
        }else {
            clientRepository.deleteById(id);
            return "client deleted, id: " + id;
        }
    }
    // delete client by client obj
    public String deleteClientByObj(@NotNull Client client){
        Client existingClient = clientRepository.findById(client.getId()).orElse(null);
        if(existingClient == null){
            return "no client found, id: " + client.getId();
        }else {
            clientRepository.delete(client);
            return "client deleted, id: " + client.getId();
        }
    }
    // update client by client obj
    public Client updateClientByObj(@NotNull Client client){
        Client existingClient = clientRepository.findById(client.getId()).orElse(null);
        if(existingClient == null){
            return null;
        }else {
            existingClient.setName(client.getName());
            existingClient.setAddress(client.getAddress());
            existingClient.setAge(client.getAge());
            existingClient.setGender(client.getGender());
            existingClient.setEmail(client.getEmail());
            existingClient.setPassword(client.getPassword());
            existingClient.setBalance(client.getBalance());

            return clientRepository.save(existingClient);
        }
    }
}
