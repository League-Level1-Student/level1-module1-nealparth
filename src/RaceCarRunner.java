

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	
	RaceCar car= new RaceCar("race", 5);
int x=	car.getPositionInRace();
		// 2. Print the RaceCar's position in the race
System.out.println(x);
		// 3. Crash the RaceCar
	car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(car.damaged) {
	car.pit();
}
		// 5. Help the car move into first place.
car= new RaceCar("race", 1);
int y= car.getPositionInRace();
System.out.println(y);
	}
}
