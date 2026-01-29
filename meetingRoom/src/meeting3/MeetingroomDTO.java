package meeting3;

import java.sql.Date;

public class MeetingroomDTO {

	private int id;
	private String reservername;
	private String reservernum;
	private String reservetime;
	private String created;
	private Date date;
	private int roomNumber;

	public MeetingroomDTO() {
		// TODO Auto-generated constructor stub
	}

	public MeetingroomDTO(int id, String reservername, String reservernum, String reservetime, String created,
			Date date, int roomNumber) {
		super();
		this.id = id;
		this.reservername = reservername;
		this.reservernum = reservernum;
		this.reservetime = reservetime;
		this.created = created;
		this.date = date;
		this.roomNumber = roomNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReservername() {
		return reservername;
	}

	public void setReservername(String reservername) {
		this.reservername = reservername;
	}

	public String getReservernum() {
		return reservernum;
	}

	public void setReservernum(String reservernum) {
		this.reservernum = reservernum;
	}

	public String getReservetime() {
		return reservetime;
	}

	public void setReservetime(String reservetime) {
		this.reservetime = reservetime;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
