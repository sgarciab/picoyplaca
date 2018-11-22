package test.java.ec.santiagogarcia.picoyplaca.plate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.ec.santiagogarcia.picoyplaca.exception.PlateNotValidException;
import main.java.ec.santiagogarcia.picoyplaca.plate.LastDigitPlateEnum;
import main.java.ec.santiagogarcia.picoyplaca.plate.Plate;
import main.java.ec.santiagogarcia.picoyplaca.plate.PlateInt;

class PlateSpec {
	
	private PlateInt plate;

	@Test
	void testValidPlate() {
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("P-8565");
			plate.validate();
		});
		
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("pbh-8565");
			plate.validate();
		});
		
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("HK-65");
			plate.validate();
		});
		
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("pUY-65");
			plate.validate();
		});
		
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("PUY789");
			plate.validate();
		});
		
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("789-tbc");
			plate.validate();
		});
		
		plate = new Plate("PBH-6587");
		assertTrue(plate.isValid());
	}
	
	@Test
	void testLastDigit() {
		assertThrows(PlateNotValidException.class,()->{
			plate = new Plate("P-8");
			plate.lastDigit();
		});
		
		plate = new Plate("PBH-6587");
		LastDigitPlateEnum last = plate.lastDigit();
		assertEquals(plate.lastDigit(),LastDigitPlateEnum.SEVEN);
		
		plate = new Plate("TBC-6582");
		assertEquals(plate.lastDigit(),LastDigitPlateEnum.TWO);
	}

}
