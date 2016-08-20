package Mapping;

public class Room {
	
	private String description;
	private String name;
	private Room leftDoor;
	private Room rightDoor;
	private Room upDoor;
	private Room downDoor;
	
	public Room (String name, String description) {
		this.description = description;
		this.name = name;
		leftDoor = null;
		rightDoor = null;
		upDoor = null;
		downDoor = null;
	}
	
	public void addLeftDoor(Room nextRoom) {
		this.leftDoor = nextRoom;
	}
	
	public void addRightDoor(Room nextRoom) {
		this.rightDoor = nextRoom;
	}
	
	public void addUpDoor(Room nextRoom) {
		this.upDoor = nextRoom;
	}
	
	public void addDownDoor(Room nextRoom){
		this.downDoor = nextRoom;
	}
	
	public Room getRightDoor() {
		return this.rightDoor;
	}
	
	public Room getLeftDoor() {
		return this.leftDoor;
	}
	
	public Room getUpDoor() {
		return this.upDoor;
	}
	
	public Room getDownDoor() {
		return this.downDoor;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getName() {
		return this.name;
	}
}
