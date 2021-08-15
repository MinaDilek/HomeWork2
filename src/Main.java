
public class Main {

	public static void main(String[] args) {
		InstructorManager ýnstructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Instructor ýnstructor1 = new Instructor();
		ýnstructor1.setFirstName("engin");
		ýnstructor1.setLastName("demiroð");
		ýnstructor1.setExperience(15);
		ýnstructor1.seteMailString("engin demirog@gmail.com");
		ýnstructor1.setPassWord(123456789);
		
		Instructor ýnstructor2 = new Instructor();
		ýnstructor2.setFirstName("suat");
		ýnstructor2.setLastName("özçelik");
		ýnstructor2.setExperience(15);
		ýnstructor2.seteMailString("suatozcelik@gmail.com");
		ýnstructor2.setPassWord(596218736);
		
		Student student1 = new Student();
		student1.setFirstName("mina");
		student1.setLastName("dilek");
		student1.setProcess(60);
		student1.seteMailString("minadilek@gmail.com");
		student1.setPassWord(57475);
		
		Student student2 = new Student();
		student2.setFirstName("ayse");
		student2.setLastName("yýlmaz");
		student2.setProcess(70);
		student2.seteMailString("ayseyýlmaz@gmail.com");
		student2.setPassWord(574136528);
		
		
		studentManager.add(student1);
		
		Student[] students = {student1 ,student2};
		studentManager.getAll(students);
		
		System.out.println("--------");
		
		ýnstructorManager.add(ýnstructor2);
		
		Instructor[] ýnstructors = { ýnstructor1,ýnstructor2 };
		ýnstructorManager.getAll(ýnstructors);
		
		
		
		
		
		

	}

}
