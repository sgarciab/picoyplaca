package main.java.ec.santiagogarcia.picoyplaca.exception;

public class PlateNotValidException extends RuntimeException{
	public PlateNotValidException (String error) {
		super ("Placa no válida. Error: " + error);
	}
}
