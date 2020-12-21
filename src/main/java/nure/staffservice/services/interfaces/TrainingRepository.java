package nure.staffservice.services.interfaces;

import nure.staffservice.domain.Training;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TrainingRepository extends CrudRepository<Training, Integer> {


	@Query(value = "select tr from Training tr where tr.trainer.id = :fktrainerid")
	public Iterable<Training> getAllByTrainer(@Param("fktrainerid") int trainerId);

}
