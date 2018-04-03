package classes;

public class Job{
	private int pid; // id of this job
	private int arrivalTime; //arrival time for this job
	private int remainingTime; //remaining service time for this job
	private int departureTime; // time when the service for this job in completed
	
	public Job( int id, int at, int rt) {
		pid=id;
		arrivalTime=at;
		remainingTime=rt;
		
	}
	public int getDepartureTime() {
		return departureTime;
	}
	
	public int setDepartureTime(int departureTime) {
		return this.departureTime=departureTime;
	}
	
	public int getpid() {
		return pid;
	}
	
	public int getarrivalTime() {
		return arrivalTime;
	}
	
	public int getremainingTime() {
		return remainingTime;
	}
	
	/**
	 * registers an update of service received by this job.
	 * @param q the time of the service being registered.
	 */
	public void isServed(int q) {
		if (q<0) return; // only registeres positive values for q
		remainingTime-=q;
	}
	
	
	/**
	 * generates a string that describes this job; useful for printing information about the job
	 */

	 public String toString() {
		return " PID = " + pid + 
				" Arrival Time = " + arrivalTime +
				" Remaining Time = " + remainingTime +
				" Departure Time = " + arrivalTime;
	 }
}