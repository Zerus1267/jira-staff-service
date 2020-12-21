package nure.staffservice.services.interfaces;

import nure.staffservice.domain.Instructions;
import org.springframework.data.repository.CrudRepository;

public interface InstructionsRepository extends CrudRepository<Instructions, Integer> {
}
