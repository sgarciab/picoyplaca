package main.java.ec.santiagogarcia.picoyplaca.pico;

import java.time.LocalDate;

public enum TimeRulesEnum {
	 START_MORNING(LocalDate.parse("07:00")), END_MORNING(LocalDate.parse("09:30")), 
	 START_NIGHT(LocalDate.parse("16:00")), END_NIGHT(LocalDate.parse("19:30"));

	   private LocalDate digit;

	   public LocalDate getDay() {

	       return this.digit;

	   }

	   TimeRulesEnum(LocalDate digit) {

	           this.digit = digit;

	   }
}
