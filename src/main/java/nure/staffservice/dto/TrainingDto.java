package nure.staffservice.dto;

import java.util.Date;

public class TrainingDto {

	public int trainingId;
	public TrainerDto trainerDto;
	public ClientDto clientDto;
	public Date date;
	public InstructionsDto instructionsDto;
	public double rate;

	public TrainingDto() {
	}

	public boolean isRateValid() {
		return rate >= 0.0 && rate <= 10.0;
	}
}
