
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("��renci Eklenmi�tir:" + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("silinmi�tir." + user.getPassWord());
	}
	public void update(User user) {
		System.out.println("G�ncellenmi�tir." + user.getLastName());
	}
	
	public void getAll(Student[] IStudents) {
		for (Student students : IStudents) {
			System.out.println(students.getFirstName());
			
		}
	}

}
