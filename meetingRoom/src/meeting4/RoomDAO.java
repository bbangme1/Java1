package meeting4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

//    private Connection getConnection() throws Exception {
//        String dbUrl = "jdbc:mysql://localhost:3306/hkkim";
//        String dbUser = "hkkim";
//        String dbPw = "1234";
//
//        return DriverManager.getConnection(dbUrl, dbUser, dbPw);
//    }

    // Create(회의실 등록)
    public int createRoom(Room room) {
        String sql = "INSERT INTO room (room_name, capacity) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, room.getRoomname());
            pstmt.setInt(2, room.getCapacity());
            
            return pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // Read(회의실 조회;전체)  
    public List<Room> getAllRooms() {
        String sql = "SELECT * FROM room order by id desc";
        List<Room> roomList = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql); 
            ResultSet rs = pstmt.executeQuery()) {
        	
        	while (rs.next()) {
        		Room room = new Room(
        			rs.getInt("id"),	
        			rs.getString("room_name"),	
        			rs.getInt("capacity")        				
        			);
        		roomList.add(room);
        	}            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomList;
    }

    // 회의실 조회(단일)
    public Room getRoom(int id) {
        String sql = "SELECT * FROM room WHERE id = ?";
        Room room = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                room = new Room(
                    rs.getInt("id"),
                    rs.getString("room_name"),
                    rs.getInt("capacity")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return room;
    }

    
    // Update(회의실 수정)
    public int updateRoom(Room room) {
        String sql = "UPDATE room SET room_name = ?, capacity = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, room.getRoomname());
            pstmt.setInt(2, room.getCapacity());
            pstmt.setInt(3, room.getId());
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // Delete(회의실 삭제)
    public int deleteRoom(int id) {
        String sql = "DELETE FROM room WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
