package Lab_Unit_6;

public class Lab_6_1 {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();
		obj.meth3();

	}

}

interface A {
	void meth1();
	void meth2();
}

interface B extends A{
	void meth3();
}
class MyClass implements B{

	@Override
	public void meth1() {
		System.out.println("Implements meth1().....");
		
	}

	@Override
	public void meth2() {
		System.out.println("Implements meth2().....");
		
	}

	@Override
	public void meth3() {
		System.out.println("Implements meth3().....");
		
	}
	
}
