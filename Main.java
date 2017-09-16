import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup sg=new StudentGroup(3);
		Student s1;
		s1=new Student(1,"Nikhil",new Date(1996,8,27),80.00);
		sg.addFirst(s1);
		sg.getStudents();
		sg.remove(s1);
		sg.getStudents();
	}

}
