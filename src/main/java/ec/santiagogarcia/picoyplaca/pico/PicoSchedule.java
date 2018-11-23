package main.java.ec.santiagogarcia.picoyplaca.pico;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import main.java.ec.santiagogarcia.picoyplaca.exception.RuleNotFoundException;
import main.java.ec.santiagogarcia.picoyplaca.plate.LastDigitPlateEnum;
import main.java.ec.santiagogarcia.picoyplaca.plate.PlateInt;

public class PicoSchedule implements PicoScheduleInt {
	public final Map<LastDigitPlateEnum, DayOfWeek> rules_days;
	private PlateInt plate;
	private LocalDate date;
	private LocalTime time;
	
	public PicoSchedule(PlateInt plate, LocalDate date, LocalTime time) {
		this.rules_days = new HashMap<>();
		this.loadConfigRulesDays();
		
		this.plate = plate;
		this.date = date;
		this.time = time;
		
	}
	
	public Boolean isAllowedToBeOnTheRoad() {
		DayOfWeek dayOfWeekFromDate = this.date.getDayOfWeek();
		DayOfWeek dayOfWeekForbbidenForPlate = this.getDayOfWeekFromPlate();
		int resultCompararison = dayOfWeekFromDate.compareTo(dayOfWeekForbbidenForPlate);
		if (resultCompararison != 0) {
			return true;
		}
		
		return this.isAllowedToBeOnTheRoadOnThisTime();
		
	}
	
	private DayOfWeek getDayOfWeekFromPlate() {
		LastDigitPlateEnum lastDigitPlate = this.plate.lastDigit();
		DayOfWeek forbiddenDayToDrive = this.rules_days.get(plate.lastDigit());
		if (forbiddenDayToDrive == null) {
			throw new RuleNotFoundException(lastDigitPlate.getDay());
		}
		return forbiddenDayToDrive;
	}
		
	
	private Boolean isAllowedToBeOnTheRoadOnThisTime() {
		int resultComparison; 
		resultComparison = this.time.compareTo(TimeRulesEnum.START_MORNING.getDay());
		if (resultComparison < 0) {
			return true;
		}
		resultComparison = this.time.compareTo(TimeRulesEnum.END_MORNING.getDay());
		if (resultComparison <= 0) {
			return false;
		}
		resultComparison = this.time.compareTo(TimeRulesEnum.START_NIGHT.getDay());
		if (resultComparison < 0) {
			return true;
		}
		resultComparison = this.time.compareTo(TimeRulesEnum.END_NIGHT.getDay());
		if (resultComparison <= 0) {
			return false;
		}
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
