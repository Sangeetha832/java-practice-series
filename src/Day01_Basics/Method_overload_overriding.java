package Day01_Basics;

public class Method_overload_overriding {
	public static void main(String[] args) {
		Calculater obj = new Calculater();
		obj.add();
		obj.add(4, 5, 2);
		
		Shape obj1 = new Shape();
		obj1.draw();
		Circle obj2 = new Circle();
		obj2.draw();
		obj2.show();
	}
}
class Calculater{
	int a = 3; int b = 2;
	
	void add() {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

class Shape{
	void draw() {
		System.out.println("show the shape");
	}
}
class Circle extends Shape{
	void show() {
		System.out.println("show the circel");
	}
	void draw() {
		System.out.println("display circle");
	}
}
 