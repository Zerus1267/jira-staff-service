package nure.staffservice.services.interfaces;

import nure.staffservice.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
