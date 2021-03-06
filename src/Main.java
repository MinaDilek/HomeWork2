
public class Main {

	public static void main(String[] args) {
		InstructorManager ınstructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Instructor ınstructor1 = new Instructor();
		ınstructor1.setFirstName("engin");
		ınstructor1.setLastName("demiroğ");
		ınstructor1.setExperience(15);
		ınstructor1.seteMailString("engin demirog@gmail.com");
		ınstructor1.setPassWord(123456789);
		
		Instructor ınstructor2 = new Instructor();
		ınstructor2.setFirstName("suat");
		ınstructor2.setLastName("özçelik");
		ınstructor2.setExperience(15);
		ınstructor2.seteMailString("suatozcelik@gmail.com");
		ınstructor2.setPassWord(596218736);
		
		Student student1 = new Student();
		student1.setFirstName("mina");
		student1.setLastName("dilek");
		student1.setProcess(60);
		student1.seteMailString("minadilek@gmail.com");
		student1.setPassWord(57475);
		
		Student student2 = new Student();
		student2.setFirstName("ayse");
		student2.setLastName("yılmaz");
		student2.setProcess(70);
		student2.seteMailString("ayseyılmaz@gmail.com");
		student2.setPassWord(574136528);
		
		
		studentManager.add(student1);
		
		Student[] students = {student1 ,student2};
		studentManager.getAll(students);
		
		System.out.println("--------");
		
		ınstructorManager.add(ınstructor2);
		
		Instructor[] ınstructors = { ınstructor1,ınstructor2 };
		ınstructorManager.getAll(ınstructors);
		
		
		
		
		
		

	}

}
