package main.java.ec.santiagogarcia.picoyplaca.pico;

import java.time.LocalTime;

public enum TimeRulesEnum {
	 START_MORNING(LocalTime.parse("07:00")), END_MORNING(LocalTime.parse("09:30")), 
	 START_NIGHT(LocalTime.parse("16:00")), END_NIGHT(LocalTime.parse("19:30"));

	   private LocalTime digit;

	   public LocalTime getDay() {

	       return this.digit;

	   }

	   TimeRulesEnum(LocalTime digit) {

	           this.digit = digit;

	   }
}
