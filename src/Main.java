
public class Main {

	public static void main(String[] args) {
		InstructorManager �nstructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Instructor �nstructor1 = new Instructor();
		�nstructor1.setFirstName("engin");
		�nstructor1.setLastName("demiro�");
		�nstructor1.setExperience(15);
		�nstructor1.seteMailString("engin demirog@gmail.com");
		�nstructor1.setPassWord(123456789);
		
		Instructor �nstructor2 = new Instructor();
		�nstructor2.setFirstName("suat");
		�nstructor2.setLastName("�z�elik");
		�nstructor2.setExperience(15);
		�nstructor2.seteMailString("suatozcelik@gmail.com");
		�nstructor2.setPassWord(596218736);
		
		Student student1 = new Student();
		student1.setFirstName("mina");
		student1.setLastName("dilek");
		student1.setProcess(60);
		student1.seteMailString("minadilek@gmail.com");
		student1.setPassWord(57475);
		
		Student student2 = new Student();
		student2.setFirstName("ayse");
		student2.setLastName("y�lmaz");
		student2.setProcess(70);
		student2.seteMailString("aysey�lmaz@gmail.com");
		student2.setPassWord(574136528);
		
		
		studentManager.add(student1);
		
		Student[] students = {student1 ,student2};
		studentManager.getAll(students);
		
		System.out.println("--------");
		
		�nstructorManager.add(�nstructor2);
		
		Instructor[] �nstructors = { �nstructor1,�nstructor2 };
		�nstructorManager.getAll(�nstructors);
		
		
		
		
		
		

	}

}
