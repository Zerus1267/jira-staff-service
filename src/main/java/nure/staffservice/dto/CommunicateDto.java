package nure.staffservice.dto;


import nure.staffservice.utils.RequestStatuses;

public class CommunicateDto {

	private RequestStatuses requestStatus;
	private String comment;

	public CommunicateDto() {
	}

	public CommunicateDto(RequestStatuses requestStatus, String comment) {
		this.requestStatus = requestStatus;
		this.comment = comment;
	}

	public RequestStatuses getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(RequestStatuses requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
