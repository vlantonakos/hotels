import java.io.Serializable;
import java.util.ArrayList;


public class Hotel implements Serializable, Comparable<Hotel> {
	
	private String name;
	private ArrayList<Reservation> reservations = new ArrayList<>();

	public Hotel(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addReservation(Reservation r)
	{
		reservations.add(r);
	}

	@Override
	public int compareTo(Hotel o) {
		return this.name.compareTo(o.name);
	}
	
	public int calculateTotalCost()
	{
		int total = 0;
		for(Reservation r : reservations)
			total += r.calculateCost();
		return total;
	}
}
