package main.java.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Player Not Found")
public class PlayerNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public final static String msg = "Player could not by found by given name.";

	public PlayerNotFoundException() {
		super(msg);
	}

}
