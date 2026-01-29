package meeting4;

public class Room { // 회의실 관리
	private int id;
	private String roomname; // 회의실명 
	private int capacity; // 회의실 수용인원
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	public Room(int id, String roomname, int capacity) {		
		this.id = id;
		this.roomname = roomname;
		this.capacity = capacity;
	}
	
    public Room(String roomname, int capacity) {
        this.roomname = roomname;
        this.capacity = capacity;
    }
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getRoomname() {
		return roomname;
	}
	public final void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public final int getCapacity() {
		return capacity;
	}
	public final void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "연번: " + id + ", 회의실명: " + roomname + " 수용인원: " + capacity + "]";
	}
	
	

}
