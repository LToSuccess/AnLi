package csdn.stx.cn;


//”√ªß¿‡
public class User {
	
	private  String username;
	private  String password;

	public User() {
	}

	public User(String name, String password) {
		this.username = name;
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}

}
