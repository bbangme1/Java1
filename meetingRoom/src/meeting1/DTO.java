package meeting1;

import java.sql.Date;

public class DTO {
	
	private int id;
	private String reserver_name;
	private String reserver_num;
	private String reserve_time;
	private Date date;
	private int room_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReserver_name() {
		return reserver_name;
	}
	public void setReserver_name(String reserver_name) {
		this.reserver_name = reserver_name;
	}
	public String getReserver_num() {
		return reserver_num;
	}
	public void setReserver_num(String reserver_num) {
		this.reserver_num = reserver_num;
	}
	public String getReserve_time() {
		return reserve_time;
	}
	public void setReserve_time(String reserve_time) {
		this.reserve_time = reserve_time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	
	public DTO(int id, String reserver_name, String reserver_num, String reserve_time, Date date, int room_id) {
		super();
		this.id = id;
		this.reserver_name = reserver_name;
		this.reserver_num = reserver_num;
		this.reserve_time = reserve_time;
		this.date = date;
		this.room_id = room_id;
	}
	public DTO() {
		super();
	}

	
	
	
	
	
	
	
}
	