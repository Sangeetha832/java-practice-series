package OOPs;

class Person{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Person obj = new Person();
		obj.setName("Jack");
		obj.setAge(30);
		
		System.out.println("Name: "+ obj.getName());
		System.out.println("Age: "+ obj.getAge());
		
	}
}
