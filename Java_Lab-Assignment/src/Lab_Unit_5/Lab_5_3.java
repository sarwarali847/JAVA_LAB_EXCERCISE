package Lab_Unit_5;

public class Lab_5_3 {

	public static void main(String[] args) {
		
		x x1=new x(10,20,30);
		y y1=new y(40,50,60);
		x1.dump();
		y1.dump();
		
		
	
	}

}

abstract class debug{
	void dump() 
	{
		System.out.println("debuggable error: no dump() defined for the class");
	}
}

class x extends debug{
	private int a,b,c;
	public x(int a1, int b1, int c1)
	{
		this.a=a1;
		this.b=b1;
		this.c=c1;
	}
	void dump() {
		System.out.println("a:"+a+", b:"+b+", c:"+c);
	          }
}

class y extends debug{
	private int p,q,r;
	public y(int p1, int q1, int r1)
	{
		this.p=p1;
		this.q=q1;
		this.r=r1;
	}
	void dump() {
		System.out.println("p:"+p+", q:"+q+", r:"+r);
	          }
}


