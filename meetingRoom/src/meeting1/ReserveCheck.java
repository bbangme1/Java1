package meeting1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import meeting2.MeetingRoom;

public class ReserveCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("회의실 예약 조회");
		DAO dao = new DAO();
		RoomDAO dao2 = new RoomDAO();
		MeetingRoom mir = new MeetingRoom();

		System.out.println("--------------------------------------------------");
		System.out.print("1. 날짜별 예약 조회 | 2. 회의실별 예약 조회: ");
		String enter = sc.nextLine();
		if (enter.equals("1")) {
			boolean isFind = false;
			System.out.println("날짜별 예약 조회");
			System.out.print("예약 날짜를 입력하세요.( ex) 2025-01-25): ");
			List<DTO> list = dao.getSelectAll();
			List<RoomDTO> list2 = dao2.getSelectAll();
			enter = sc.nextLine();
			for (DTO dto : list) {
				if (dto.getDate().toString().equals(enter)) {
					for (RoomDTO dto2 : list2) {
						if (dto.getRoom_id() == dto2.getId()) {
							String roomName = dto2.getRoomName();
							System.out.println("--------------------------------------------------");
							System.out.println("이름: " + dto.getReserver_name());
							System.out.println("예약 회의실: " + roomName);
							System.out.println("예약 인원: " + dto.getReserver_num() + "명");
							System.out.println("대여시간: " + dto.getReserve_time());
							System.out.println("예약 등록일: " + dto.getDate());
							isFind = true;
						}
					}
				}
			}
			if (isFind == false) {
				System.out.println("예약된 정보가 없습니다.");
			}

		} else if (enter.equals("2")) {
			boolean isFind = false;
			System.out.println("--------------------------------------------------");
			System.out.println("회의실별 예약 조회");
			System.out.print("회의실명을 입력하세요. ( ex) 대 회의실): ");
			List<DTO> list = dao.getSelectAll();
			List<RoomDTO> list2 = dao2.getSelectAll();
			enter = sc.nextLine();
			for (RoomDTO dto2 : list2) {
				if (dto2.getRoomName().equals(enter)) {
					for (DTO dto : list) {
						if (dto.getRoom_id() == dto2.getId()) {
							System.out.println("--------------------------------------------------");
							System.out.println("이름: " + dto.getReserver_name());
							System.out.println("예약 인원: " + dto.getReserver_num() + "명");
							System.out.println("대여시간: " + dto.getReserve_time());
							System.out.println("예약 등록일: " + dto.getDate());
							isFind = true;
						}
					}
				}
			}
			if (isFind == false) {
				System.out.println("예약된 정보가 없습니다.");
			}
		} else {
			System.out.println("잘못된 키 입력 입니다.");
		}

	}
}
