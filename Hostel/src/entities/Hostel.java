package entities;

public class Hostel {
	private int rooms;

	
	
	public Hostel(int rooms) {
		this.rooms = rooms;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return rooms + ":";
	}
	
	
	
}
