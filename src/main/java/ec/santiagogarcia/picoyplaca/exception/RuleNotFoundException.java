package main.java.ec.santiagogarcia.picoyplaca.exception;

public class RuleNotFoundException extends RuntimeException{
	public RuleNotFoundException (String error) {
		super ("No existe día para esa placa: " + error);
	}
}
