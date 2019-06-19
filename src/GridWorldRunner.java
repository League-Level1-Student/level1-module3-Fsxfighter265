import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.Random;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;

public class GridWorldRunner {
	public static void main(String[] args) {
		World Earth = new World();
		Location Bug = new Location(new Random().nextInt(10),new Random().nextInt(10));
		Location Flower = new Location(new Random().nextInt(10), new Random().nextInt(10));
		Bug Bob = new Bug();
		Flower Jimmy = new Flower();
		
		Earth.show();
		Earth.add(Bug, Bob);
		Earth.add(Flower, Jimmy);
		
	}
}
