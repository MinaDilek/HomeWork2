
public class User {
	private String firstName;
	private String lastName;
	private String eMailString;
	private int passWord;
	
	public User() {}
	public User(String firstName, String lastName, String eMailString, int passWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMailString = eMailString;
		this.passWord = passWord;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMailString() {
		return eMailString;
	}
	public void seteMailString(String eMailString) {
		this.eMailString = eMailString;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	

}
