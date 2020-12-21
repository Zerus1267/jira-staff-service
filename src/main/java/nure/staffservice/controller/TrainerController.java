package nure.staffservice.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import nure.staffservice.domain.Trainer;
import nure.staffservice.domain.User;
import nure.staffservice.dto.CommunicateDto;
import nure.staffservice.dto.LoginForm;
import nure.staffservice.services.DtoService;
import nure.staffservice.services.interfaces.TrainerRepository;
import nure.staffservice.services.interfaces.UserRepository;
import nure.staffservice.utils.RequestStatuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

	private static final ObjectMapper om = new ObjectMapper();

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TrainerRepository trainerRepository;
	@Autowired
	private DtoService dtoService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path = "/login")
	public JsonNode login(@RequestBody LoginForm loginForm) {
		if (!loginForm.isValid()) {
			return om.valueToTree(new CommunicateDto(RequestStatuses.ERROR, RequestStatuses.ERROR.getMessage()));
		}
		User user = userRepository.getByLogin(loginForm.login);
		Trainer trainer = null;
		if (user != null && user.getRole().isTrainer()) {
			trainer = trainerRepository.getByUser(user);
		}
		return om.valueToTree(trainer == null ? new CommunicateDto(RequestStatuses.ERROR, RequestStatuses.ERROR.getMessage()) :
				dtoService.transformTrainerToDto(trainer));
	}

}
