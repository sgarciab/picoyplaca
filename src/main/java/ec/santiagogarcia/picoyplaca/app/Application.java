package main.java.ec.santiagogarcia.picoyplaca.app;

import main.java.ec.santiagogarcia.picoyplaca.command.CommandInt;
import main.java.ec.santiagogarcia.picoyplaca.command.CommandPredict;

public class Application {

	public static void main (final String[] args) throws Exception{
			if (args.length != 3) {
				System.out.println("Deben ser 3 parámetros. Ejemplo: TBC-6496 2018-11-12 16:30");
			}
			CommandInt command = new CommandPredict(args[0],args[1],args[2]);
			command.execute();
	}
	
	
}
