
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Öğrenci Eklenmiştir:" + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("silinmiştir." + user.getPassWord());
	}
	public void update(User user) {
		System.out.println("Güncellenmiştir." + user.getLastName());
	}
	
	public void getAll(Student[] IStudents) {
		for (Student students : IStudents) {
			System.out.println(students.getFirstName());
			
		}
	}

}
