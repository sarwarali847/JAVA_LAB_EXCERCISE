package Lab_Unit_5;

public class Lab_5_2 {

	public static void main(String[] args) {
	shape c=new circle();
	c.draw();
	shape s=new square();
	s.draw();

	}

}

abstract class shape{
	abstract void draw();
}
class circle extends shape{
	void draw() {
		System.out.println("Drwaing circle....");
	}
	
}

class square extends shape{
	void draw() {
		System.out.println("Drwaing square...");
	}
}


