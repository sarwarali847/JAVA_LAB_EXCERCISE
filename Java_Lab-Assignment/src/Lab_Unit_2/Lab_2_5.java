package Lab_Unit_2;
import java.util.*;

public class Lab_2_5 {

	public static void main(String[] args) {
		int i,j,rows;
		int count=1;
		Scanner scan=new Scanner(System.in);
		rows=5;
		for(i=1; i<=rows; i++){
		  for(j=1; j<=i; j++){
		  if(j%2==1)
		  {
		      System.out.print("1");
		  }
		  else
		  {
		      System.out.print("0");
		  }
	 }
 		  
		 System.out.println();
		 
}
		
		
		System.out.print("========"+"\n");
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			}
		}
	}