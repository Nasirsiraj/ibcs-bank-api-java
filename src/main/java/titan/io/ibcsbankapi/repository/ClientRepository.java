package titan.io.ibcsbankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import titan.io.ibcsbankapi.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByNid(int nid);
}
