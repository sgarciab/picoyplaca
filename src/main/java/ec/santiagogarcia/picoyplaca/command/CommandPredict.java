package main.java.ec.santiagogarcia.picoyplaca.command;

import java.time.LocalDate;
import java.time.LocalTime;

import main.java.ec.santiagogarcia.picoyplaca.pico.PicoSchedule;
import main.java.ec.santiagogarcia.picoyplaca.pico.PicoScheduleInt;
import main.java.ec.santiagogarcia.picoyplaca.plate.Plate;
import main.java.ec.santiagogarcia.picoyplaca.plate.PlateInt;

public class CommandPredict implements CommandInt {
	private PicoScheduleInt picoSchedule;
	private PlateInt plate;
	private LocalDate date;
	private LocalTime time;
	
	public CommandPredict (String plate, String date, String time) {
		this.plate = this.getPlate(plate);
		this.date = this.getDate(date);
		this.time = this.getTime(time);
		this.picoSchedule = new PicoSchedule(this.plate, this.date, this.time);
	}

	@Override
	public void execute() {
		this.plate.validate();
		Boolean isAllowedToBeOnTheRoad = this.picoSchedule.isAllowedToBeOnTheRoad();
		if (isAllowedToBeOnTheRoad) {
			System.out.println("Puede andar");
		}else {
			System.out.println("NO ESTÁ PERMITO DE ANDAR");
		}
		
	}
	
	private PlateInt getPlate(String plate) {
		return new Plate(plate);
	}
	
	private LocalDate getDate(String date) {
		return LocalDate.parse(date);
	}
	

	private LocalTime getTime(String time) {
		return LocalTime.parse(time);
	}
	

}
