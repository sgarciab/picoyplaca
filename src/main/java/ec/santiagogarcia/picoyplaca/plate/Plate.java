package main.java.ec.santiagogarcia.picoyplaca.plate;

import java.util.HashMap;
import java.util.Map;

import main.java.ec.santiagogarcia.picoyplaca.exception.PlateNotValidException;

public class Plate implements PlateInt {
	
	private String plate;
	
	private static final String PATTERN_PLATE = "^([A-Z]{3}-\\d{3,4})$";
	
	private static final Map<String, LastDigitPlateEnum> StringToTypeLastDigitPlateEnum = new HashMap<String, LastDigitPlateEnum>();
	static {
		for (LastDigitPlateEnum type : LastDigitPlateEnum.values()) {
			StringToTypeLastDigitPlateEnum.put(type.digit, type);
		}	
	}
	
	public Plate (String plate) {
		this.plate = plate;
	}
	
	public void validate()  {
		if (!this.isValid()) {
			this.throwNotValidPlate();
		}
	}
	
	public Boolean isValid() {
		return this.plate.matches(PATTERN_PLATE);
	}
	
	public LastDigitPlateEnum lastDigit() {
		if (this.isValid()) {
			String lastdigit = this.plate.substring(this.plate.length()-1);
			LastDigitPlateEnum lastDigitPlateEnum = StringToTypeLastDigitPlateEnum.get(lastdigit);
			return  lastDigitPlateEnum;
		}
		this.throwNotValidPlate();
		return null;
	}
	
	private void throwNotValidPlate() {
		throw new PlateNotValidException("No es una placa válida para Ecuador");
	}
	
}
