package stduy20260114;

public class ItemMain {

	public static void main(String[] args) {

		DBCon login = new DBCon();
		
		Item[] items = login.findItems();
		
		System.out.println(items[8]);
	}

}
