package netflix;

public class Main {
	public static void main(String[] args) {
		Movie MovieOne = new Movie("Thor", 4);
		Movie MovieTwo = new Movie("Spider Man", 3);
		Movie MovieThree = new Movie("Iron Man", 5);
		Movie MovieFour = new Movie("Hulk", 2);
		Movie MovieFive = new Movie("Thanos", 5);
		
		String PriceOne = MovieOne.getTicketPrice();
		String PriceTwo = MovieTwo.getTicketPrice();
		String PriceThree = MovieThree.getTicketPrice();
		String PriceFour = MovieFour.getTicketPrice();
		String PriceFive = MovieFive.getTicketPrice();
		
		System.out.println(PriceOne);
		System.out.println(PriceTwo);
		System.out.println(PriceThree);
		System.out.println(PriceFour);
		System.out.println(PriceFive);
		
		NetflixQueue Queue = new NetflixQueue();
		Queue.addMovie(MovieOne);
		Queue.addMovie(MovieTwo);
		Queue.addMovie(MovieThree);
		Queue.addMovie(MovieFour);
		Queue.addMovie(MovieFive);
		Queue.printMovies();
		
		System.out.println();
	}
}