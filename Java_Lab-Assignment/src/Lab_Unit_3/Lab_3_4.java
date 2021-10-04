package Lab_Unit_3;

public class Lab_3_4 {
	
	int id;
	String name;
	
	
	public Lab_3_4(){
		id=0;
		name="Unknown";
	}


	public Lab_3_4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void showdata(){
		System.out.println("Id:"+id+", Name:"+name);
	}
	

}
