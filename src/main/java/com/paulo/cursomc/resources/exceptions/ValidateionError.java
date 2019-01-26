package com.paulo.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidateionError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidateionError(Long timestemp, Integer status, String error, String message, String path) {
		super(timestemp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}
