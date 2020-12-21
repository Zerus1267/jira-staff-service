package nure.staffservice.utils;

import java.util.HashMap;
import java.util.Map;

public class ErrorManager {

	private Map<String, String> errors;

	public ErrorManager() {
		errors = new HashMap<>();
	}

	public ErrorManager(Map<String, String> errors) {
		this.errors = errors;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public boolean isEmpty() {
		return errors.isEmpty();
	}

	public String getErrorsText() {
		StringBuilder sb = new StringBuilder();
		errors.values().forEach(error -> sb.append(error + " "));
		return sb.toString();
	}
}
