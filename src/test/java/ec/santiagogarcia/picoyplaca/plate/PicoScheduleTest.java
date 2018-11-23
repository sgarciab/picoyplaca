package test.java.ec.santiagogarcia.picoyplaca.plate;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.*;

import main.java.ec.santiagogarcia.picoyplaca.pico.PicoSchedule;
import main.java.ec.santiagogarcia.picoyplaca.pico.PicoScheduleInt;
import main.java.ec.santiagogarcia.picoyplaca.plate.Plate;
import main.java.ec.santiagogarcia.picoyplaca.plate.PlateInt;

class PicoScheduleTest {

	private PicoScheduleInt picoSchedule;
	private PlateInt plate;
	
	@BeforeEach
	void prepare() {
		plate = new Plate("PBH-6496");
		
	}
	@Test
	void testForbiddenDayForPlate() {

		LocalDate date = LocalDate.parse("2018-11-21");
		LocalTime time = LocalTime.parse("06:30");
		
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("08:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("09:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("13:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("16:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertFalse(picoSchedule.isAllowedToBeOnTheRoad());
	}
	@Test
	void testAllowedDayForPlateWeekdays() {

		LocalDate date = LocalDate.parse("2018-11-22");
		LocalTime time = LocalTime.parse("06:30");
		
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("08:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("09:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("13:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("16:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
	}
	
	@Test
	void testAllowedDayForPlateWeekends() {

		LocalDate date = LocalDate.parse("2018-11-24");
		LocalTime time = LocalTime.parse("06:30");
		
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("08:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("09:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("13:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("16:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
		
		time = LocalTime.parse("19:30");
		picoSchedule = new PicoSchedule(plate, date, time );
		assertTrue(picoSchedule.isAllowedToBeOnTheRoad());
	}

}
