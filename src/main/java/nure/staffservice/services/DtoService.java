package nure.staffservice.services;

import nure.staffservice.domain.Trainer;
import nure.staffservice.dto.TrainerDto;
import nure.staffservice.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class DtoService {

	public TrainerDto transformTrainerToDto(Trainer trainer) {
		TrainerDto dto = new TrainerDto();
		dto.firstName = trainer.getFirstName();
		dto.lastName = trainer.getLastName();
		dto.rate = trainer.getRate();
		dto.id = trainer.getId();
		return dto;
	}


}
