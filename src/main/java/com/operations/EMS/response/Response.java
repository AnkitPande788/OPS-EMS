package com.operations.EMS.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
	
	int httpStatus;

	int responseCode;

	String responseMessage;
	
	Object data = new Object();

	public Response(Object data) {
		super();
		this.data = data;
	}
}
