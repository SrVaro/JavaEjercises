package com.varo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class KittyNotFoundException extends RuntimeException{

	public KittyNotFoundException() {
		super("Kitty does not exist");
	}

}
