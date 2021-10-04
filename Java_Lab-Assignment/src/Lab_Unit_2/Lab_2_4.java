package Lab_Unit_2;

public class Lab_2_4 {

	public static void main(String args[]) {
		int sum=0;
	
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum of arguments:"+sum);

	 for(int j=0;j<args.length;j++)
	 {
		 if(Integer.parseInt(args[j])>0)
		 {
			 System.out.println(args[j]+" ");
		 }
	 }
	 
	 
 

}
}
