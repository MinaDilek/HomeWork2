
public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Eğitmen eklenmiştir: "+ user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("eğitmen silinmiştir: " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("eğitmen bilgileri güncellenmiştir. "+ user.getFirstName());
	}
	
	public void getAll(Instructor[] Instructors) {
		for (Instructor instructors : Instructors) {
			System.out.println(instructors.getFirstName());
			
		}
	}
	
}
