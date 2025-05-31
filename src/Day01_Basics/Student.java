package Day01_Basics;

public class Student {
	private String name;
	private int rollnumber;
	private int[] marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	void displayDetails() {
		System.out.println("Student name: "+name);
		System.out.println("Student rollnumber: "+rollnumber);
		System.out.println("Student marks: ");
		if(marks.length >0 && marks != null) {
			for(int i : marks) {
				System.out.print(i+", ");
			}
		}else {
			System.out.println("No marks available");
		}
	}
	double calculateAverage() {
		int averageMark =0;
		int sum =0;
		
		for(int s : marks) {
			sum += s;
		}
		averageMark = sum /(marks.length);
		
		return averageMark;
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		
		
		
		obj.setName("jack");
		obj.setRollnumber(001);
		obj.setMarks(new int[] {98,65,32,45,78});
		
		obj.displayDetails();
		System.out.println();
		System.out.println("The average mark of the student: "+obj.calculateAverage());
		
	}
}
