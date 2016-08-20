package Mapping;

import java.util.LinkedList;

public class MappingManager {

	private LinkedList<Room> rooms;
	
	public Room initializeMap() {
		rooms = new LinkedList<>();
		
		//Teste
		addRoom("sala", "Este lugar é bem ventilado");
		addRoom("cozinha", "Que fedor de carne podre!");
		addRoom("banheiro", "O chão está alagado");
		addRoom("quarto", "Que lugar escuro!");
		addRoom("varanda", "Ossos no chão?");
		
		addUpDoor(rooms.get(0), rooms.get(1));
		addDownDoor(rooms.get(0), rooms.get(2));
		addLeftDoor(rooms.get(0), rooms.get(3));
		addRightDoor(rooms.get(0), rooms.get(4));		
		
		return rooms.get(0); // O primeiro quarto é sempre o inicial
	}
	
	private void addRoom(String description, String id) {
		Room room = new Room(description, id);
		
		rooms.add(room);
	}
	
	private void addUpDoor(Room origin, Room destination) {
		origin.addUpDoor(destination);
		destination.addDownDoor(origin);
	}
	
	private void addDownDoor(Room origin, Room destination) {
		origin.addDownDoor(destination);
		destination.addUpDoor(origin);
	}
	
	private void addLeftDoor(Room origin, Room destination) {
		origin.addLeftDoor(destination);
		destination.addRightDoor(origin);
	}
	
	private void addRightDoor(Room origin, Room destination){
		origin.addRightDoor(destination);
		destination.addLeftDoor(origin);
	}
}
