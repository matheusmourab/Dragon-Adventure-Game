package Mapping;

public class NavigationManager {
	
	private MappingManager mapManager;
	private Room currentRoom; 
	
	public NavigationManager() {
		mapManager = new MappingManager();
		currentRoom = mapManager.initializeMap();
	}
	
	public String getPosition() {
		return currentRoom.getName();
	}
	
	public String getDescription() {
		return currentRoom.getDescription();
	}
	
	public boolean moveRight() {
		if(currentRoom.getRightDoor() != null) {
			currentRoom = currentRoom.getRightDoor();
			return true;
		}
		else return false;
		
	}
	
	public boolean moveLeft() {
		if(currentRoom.getLeftDoor() != null) {
			currentRoom = currentRoom.getLeftDoor();
			return true;
		}
		else return false;
		
	}
	
	public boolean moveUp() {
		if(currentRoom.getUpDoor() != null) {
			currentRoom = currentRoom.getUpDoor();
			return true;
		}
		else return false;
		
	}
	
	public boolean moveDown() {
		if(currentRoom.getDownDoor() != null) {
			currentRoom = currentRoom.getDownDoor();
			return true;
		}
		else return false;
		
	}
}
