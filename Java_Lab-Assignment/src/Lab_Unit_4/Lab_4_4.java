package Lab_Unit_4;

public class Lab_4_4 {

	public static void main(String[] args) {
		bus obj=new bus();
		obj.show();
		car obj3=new car();
		obj3.show();
		vehicle obj4=new vehicle();
		obj4.show();
		

	}

}

class vehicle{
	void show()
	{
		System.out.println("Vehicle is running...");
	}
}

class car extends vehicle{
	void show()
	{
		System.out.println("Car is running...");
	}
}

class bus extends vehicle{
	void show() {
		System.out.println("Bus is running.....");
	}
}