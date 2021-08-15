
public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Eðitmen eklenmiþtir: "+ user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("eðitmen silinmiþtir: " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("eðitmen bilgileri güncellenmiþtir. "+ user.getFirstName());
	}
	
	public void getAll(Instructor[] Instructors) {
		for (Instructor instructors : Instructors) {
			System.out.println(instructors.getFirstName());
			
		}
	}
	
}
