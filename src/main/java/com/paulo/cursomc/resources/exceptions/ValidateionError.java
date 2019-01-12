package com.paulo.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidateionError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidateionError(Integer status, String msg, Long timeStemp) {
		super(status, msg, timeStemp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}
