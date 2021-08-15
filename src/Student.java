
public class Student extends User{
	private String firstName;
	private String lastName;
	private int process;
	
	
	    public Student() {}
	    public Student(String firstName, String lastName, int process) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.process = process;
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
	public int getProcess() {
		return process;
	}
	public void setProcess(int process) {
		this.process = process;
	}
	public void seteMailString(String eMailString) {
		// TODO Auto-generated method stub
		
	}
	

}
