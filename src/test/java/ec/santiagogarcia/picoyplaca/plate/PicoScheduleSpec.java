package test.java.ec.santiagogarcia.picoyplaca.plate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.ec.santiagogarcia.picoyplaca.pico.PicoSchedule;
import main.java.ec.santiagogarcia.picoyplaca.pico.PicoScheduleInt;
import main.java.ec.santiagogarcia.picoyplaca.plate.Plate;
import main.java.ec.santiagogarcia.picoyplaca.plate.PlateInt;

class PicoScheduleSpec {

	private PicoScheduleInt picoSchedule;
	private PlateInt plate;
	@Test
	void test() {
		plate = new Plate("PBH-6587");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
		
	}

}
