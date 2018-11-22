package main.java.ec.santiagogarcia.picoyplaca.plate;

public enum LastDigitPlateEnum {
	   ZERO("0"), ONE("1"), TWO("2"), THREE("3"),
	   FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"),
	   EIGHT("8"), NINE("9");

	   public String digit;

	   public String getDay() {

	       return this.digit;

	   }

	   LastDigitPlateEnum(String digit) {

	           this.digit = digit;

	   }
}
