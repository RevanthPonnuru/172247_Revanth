package student;

public class Student {

	String address;
	int numCourse=0;
	String name;
	String[] courses=new String[30];
	int []grades=new int[30];
	public Student() {
	
	}
	public Student(String name,	String address) {
		this.name = name;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + "]";
	}
	public void  addCourseGrade(String course, int grade) {
		this.courses[numCourse] = course;
		this.grades[numCourse] = grade;
		numCourse++;
	}
	public double getAverageGrade() {
		int sum=0;
		for(int i=0;i<numCourse;i++) {
			sum=sum+grades[i];
		}
		return sum/(numCourse);
			
	}
	public void printGrades() {
		System.out.println(getName()+"  ");
		for(int i=0;i<numCourse;i++) {
			System.out.println(courses[i]+" : "+grades[i]);
		}
		
	}
}
