package meeting2;

import java.util.Scanner;

import meeting1.ReserveCheck;
import meeting3.Meetingroom;
import meeting4.Main;

public class MeetingRoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("선택(1:조회, 2:등록, 3:삭제, 4:관리자모드, 5:종료)");
			String menu = sc.nextLine();
			MeetingRoomDAO dao = new MeetingRoomDAO();
			MeetingRoomDTO dto = new MeetingRoomDTO();
			int result = 0;

			switch (menu) {
			case "1":
				ReserveCheck.main(args);
				break;
			case "2":
				dao.RoomList();
				System.out.print("예약할 회의실 번호 선택: ");
				int Room = Integer.parseInt(sc.nextLine());
				dto.setRoomId(Room);

				int maxpeople = dao.RoomExceeded(Room);

				dto.inputField("chuga");
				int people = Integer.parseInt(dto.getreserverNum());

				if (people > maxpeople) {
					System.out.println("최대인원이 초과되었습니다.");
				} else if (dao.TimeOverlap(dto)) {
					System.out.println("해당 시간에 이미 예약이 있습니다.");
				} else {
					int result1 = dao.setInsert(dto);
					if (result1 > 0) {
						System.out.println("예약 완료");
					}
				}
				break;
			case "3":
				Meetingroom.main(args);
				break;
			case "4":
				Main.main(args);
				break;
			default:
				System.out.println("- 프로그램 종료 -");
				return;

			}

		}

	}
}
