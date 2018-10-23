package main.java.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Spell Not Found")
public class SpellNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public final static String msg = "Spell could not by found.";

	public SpellNotFoundException() {
		super(msg);
	}

}
