package nure.staffservice.utils;

public enum RequestStatuses {

	OK("Request finished sucessufully", "0"),
	ERROR("Request not executed. Error!", "1"),
	WARNING("WARNING! Please read the comment", "2");

	private final String message;
	private final String code;

	RequestStatuses(String message, String code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}
}
