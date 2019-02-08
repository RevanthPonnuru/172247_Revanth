package student;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
        s.setName("Mirza");
        s.setAddress("BTM");
        s.addCourseGrade("BE", 9);
        s.addCourseGrade("ME", 8);
        s.addCourseGrade("MCA", 7);
        s.printGrades();
        System.out.println(s.getAverageGrade());
	}

}
