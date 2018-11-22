package main.java.ec.santiagogarcia.picoyplaca.pico;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import main.java.ec.santiagogarcia.picoyplaca.plate.LastDigitPlateEnum;

public class PicoSchedule implements PicoScheduleInt {
	public final Map<LastDigitPlateEnum, DayOfWeek> rules_days;
	
	public PicoSchedule() {
		this.rules_days = new HashMap<>();
		this.loadConfigRulesDays();
	}
	
	public Boolean isAllowedToBeOnTheRoad() {
		return true;
	}
	
	
	
	private void loadConfigRulesDays() {
		this.rules_days.put(LastDigitPlateEnum.ONE, DayOfWeek.MONDAY);
		this.rules_days.put(LastDigitPlateEnum.TWO, DayOfWeek.MONDAY);
		
		this.rules_days.put(LastDigitPlateEnum.THREE, DayOfWeek.TUESDAY);
		this.rules_days.put(LastDigitPlateEnum.FOUR, DayOfWeek.TUESDAY);
		
		this.rules_days.put(LastDigitPlateEnum.FIVE, DayOfWeek.WEDNESDAY);
		this.rules_days.put(LastDigitPlateEnum.SIX, DayOfWeek.WEDNESDAY);
		
		this.rules_days.put(LastDigitPlateEnum.SEVEN, DayOfWeek.THURSDAY);
		this.rules_days.put(LastDigitPlateEnum.EIGHT, DayOfWeek.THURSDAY);
		
		this.rules_days.put(LastDigitPlateEnum.NINE, DayOfWeek.FRIDAY);
		this.rules_days.put(LastDigitPlateEnum.ZERO, DayOfWeek.FRIDAY);
	}
	
	
	
}
