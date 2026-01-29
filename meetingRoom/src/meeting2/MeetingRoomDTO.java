package meeting2;

import java.sql.Date;
import java.util.Scanner;

public class MeetingRoomDTO {

	private int id; // 기본키
	private String reserverName; // 예약자
	private String reserverNum; // 예약인원
	private String reserveTime; // 예약시간
	private Date date; // 날짜
	private int roomId;

	Scanner sc = new Scanner(System.in);

	public MeetingRoomDTO() {
	}

	public MeetingRoomDTO(int id, String reserverName, String reserverNum, String reserveTime, Date date) {
		super();
		this.id = id;
		this.reserverName = reserverName;
		this.reserverNum = reserverNum;
		this.reserveTime = reserveTime;
		this.date = date;
	}

	public void inputField(String gubun) {
		if (gubun.equals("chuga")) {
			try {
				System.out.println("예약자 입력 : ");
				this.reserverName = sc.nextLine();
				
				System.out.println("인원 입력 : ");
				this.reserverNum = sc.nextLine();

				System.out.println("예약 날짜 입력 (예: 2026-01-29) : ");
				String dateDay = sc.nextLine();
				this.date = date.valueOf(dateDay);

				System.out.println("시간 입력 (예: 10:00-11:00) : ");
				this.reserveTime = sc.nextLine();

				
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReserverName() {
		return reserverName;
	}

	public void setReserverName(String reserverName) {
		this.reserverName = reserverName;
	}

	public String getreserverNum() {
		return reserverNum;
	}

	public void setreserverNum(String reserverNum) {
		this.reserverNum = reserverNum;
	}

	public String getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
}
