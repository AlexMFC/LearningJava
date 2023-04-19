package entities;

public class Rent {
	private int room;
	private Student student;
	
	public Rent(int room, Student student) {
		this.setRoom(room);
		this.setStudent(student);
	}
	
	public void roomsStatus() {
		System.out.printf("The room number " + getRoom() + " is currently rented by \n" + student.status());
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
