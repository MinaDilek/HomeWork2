
public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("E�itmen eklenmi�tir: "+ user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("e�itmen silinmi�tir: " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("e�itmen bilgileri g�ncellenmi�tir. "+ user.getFirstName());
	}
	
	public void getAll(Instructor[] Instructors) {
		for (Instructor instructors : Instructors) {
			System.out.println(instructors.getFirstName());
			
		}
	}
	
}
