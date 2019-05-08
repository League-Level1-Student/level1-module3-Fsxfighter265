package Athletes;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Athleltes {

	     static int nextBibNumber;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athleltes (String name, int speed, int bibNumber){
	     this.name = name;
	     this.speed = speed;
	     this.bibNumber = bibNumber;
	}

	public static void main(String[] args) {
	    //create two athletes      //print their names, bibNumbers, and the location of their race.
		Athleltes athleteOne = new Athleltes("Jimmy", 7, 1);
		Athleltes athleteTwo = new Athleltes("Jack", 14, 2);
		
		System.out.println(athleteOne.name + " is " + athleteOne.bibNumber + " and is set in " + raceLocation);
		System.out.println(athleteTwo.name + " is " + athleteTwo.bibNumber + " and is set in " + raceLocation);
		
		
	}
}	
