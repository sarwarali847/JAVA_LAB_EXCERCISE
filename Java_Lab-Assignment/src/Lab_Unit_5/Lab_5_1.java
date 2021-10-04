package Lab_Unit_5;

public class Lab_5_1 {

	public static void main(String[] args) {
		
		shape sh=new shape();
		circle c=new circle();
		square s=new square();
		triangle t=new triangle();
		sh.draw();
		sh.erase();
		c.draw();
		c.erase();
		s.draw();
		s.erase();
		t.draw();
		t.erase();
		 

	}

}

class shape{
	void draw() {
		System.out.println("Drawing shape....");
	}
	void erase() {
		System.out.println("Erasing shape....");
	}
}

class circle extends shape{
	void draw() {
		System.out.println("Drawing circle...");
	}
	void erase() {
		System.out.println("Erasing circle....");
	}
}

class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle...");
	}
	void erase() {
		System.out.println("Erasing triangle....");
	}
}

class square extends shape{
	void draw() {
		System.out.println("Drawing square...");
	}
	void erase() {
		System.out.println("Erasing square....");
	}
}
