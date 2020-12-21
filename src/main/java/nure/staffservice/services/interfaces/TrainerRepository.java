package nure.staffservice.services.interfaces;

import nure.staffservice.domain.Trainer;
import nure.staffservice.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

	Trainer getByUser(User user);

}
