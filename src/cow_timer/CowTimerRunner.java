package cow_timer;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */
		CowTimer CowWithTime = new CowTimer();
		CowWithTime.setTime(20);
		CowWithTime.start();
	}
}
