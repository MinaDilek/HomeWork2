
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Öðrenci Eklenmiþtir:" + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("silinmiþtir." + user.getPassWord());
	}
	public void update(User user) {
		System.out.println("Güncellenmiþtir." + user.getLastName());
	}
	
	public void getAll(Student[] IStudents) {
		for (Student students : IStudents) {
			System.out.println(students.getFirstName());
			
		}
	}

}
