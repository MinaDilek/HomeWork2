
public class Instructor extends User {
	private String firstName;
	private String lastName;
	private int experience;
	
	public Instructor() {}
	public Instructor(String firstName, String lastName, int experience) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.experience = experience;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void seteMailString(String eMailString) {
		// TODO Auto-generated method stub
		
	}
	
	

}
