package meeting1;

public class RoomDTO {
	
	private int id;
	private String roomName;
	private int capacity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public RoomDTO() {
		super();
	}
	
	public RoomDTO(int id, String roomName, int capacity) {
		super();
		this.id = id;
		this.roomName = roomName;
		this.capacity = capacity;
	}
		
}