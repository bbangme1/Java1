package stduy20260113;

public class User {

	private String id;
	private String password;
	private String name;
	private String tal;

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", tal=" + tal + "]";
	}
	public User() {}
	public User(String id, String password, String name, String tal) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.tal = tal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTal() {
		return tal;
	}

	public void setTal(String tal) {
		this.tal = tal;
	}

}
