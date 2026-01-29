package meeting4;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RoomDAO dao = new RoomDAO();
		DBConnection db = new DBConnection();
		Room rom = new Room();
		
		
			System.out.print("===회의실 관리 시스템===\n");
			System.out.println("1. 회의실 현황");
			System.out.println("2. 회의실 수정");
			System.out.println("3. 회의실 삭제");
			System.out.println("4. 회의실 등록");
			
			int menu = sc.nextInt();		
			System.out.println("");
			
			switch (menu) {			 
			
				case 1:
					System.out.print("==회의실 현황==\n");
					
					List<Room> rooms = dao.getAllRooms();
					for (Room r : rooms) {
						System.out.println(r);
					}
					break;
				case 2:
					System.out.println("수정할 회의실 ID 입력: ");
					int updateId = sc.nextInt();
					sc.nextLine();
					
					Room updateRoom = dao.getRoom(updateId);
					if (updateRoom == null) {
						System.out.println("존재하지 않는 회의실입니다.");
						break;
					}
					
					System.out.println("==현재 정보==" + updateRoom);
					
					System.out.print("새 회의실 이름 입력: ");
					String newName = sc.nextLine();
					
					System.out.print("새 수용 인원 입력: ");
					int newCapacity = sc.nextInt();
					
					updateRoom.setRoomname(newName);
					updateRoom.setCapacity(newCapacity);
					
					dao.updateRoom(updateRoom);
					System.out.println("회의실 수정 완료");
					break;
					
				case 3:
					System.out.print("삭제할 회의실 ID 입력: ");
					int deleteId = sc.nextInt();
					
					dao.deleteRoom(deleteId);
					System.out.println("회의실 삭제 완료");
					break;
				
				case 4:
					System.out.print("새 회의실 이름 입력: ");
					String name = sc.nextLine();
					
					System.out.print("수용 인원 입력: ");
					int capacity = sc.nextInt();
					
					Room newRoom = new Room(name, capacity);
					dao.createRoom(newRoom);
					System.out.println("회의실 등록 완료");
					break;
				case 5:
					sc.close();
					break;
					
				default:
					System.out.println("잘못된 입력입니다.");
					return;
			}
		
	}
}
