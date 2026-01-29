package meeting3;

import java.sql.Date;
import java.util.Scanner;

public class Meetingroom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MeetingroomDTO dto = new MeetingroomDTO();
		MeetingroomDAO dao = new MeetingroomDAO();

		System.out.println("--- 예약 삭제 ---");
        System.out.print("삭제할 예약자 성함: ");
        dto.setReservername(sc.nextLine());

        System.out.print("예약 날짜 입력 (YYYY-MM-DD): ");
        try {
            dto.setDate(Date.valueOf(sc.nextLine()));
            int delResult = dao.setDelete(dto);
            
            if (delResult > 0) {
                System.out.println("삭제가 완료되었습니다.");
            } else {
                System.out.println("일치하는 예약 정보를 찾을 수 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("날짜 형식이 올바르지 않습니다.");
        }
	
	}
}
