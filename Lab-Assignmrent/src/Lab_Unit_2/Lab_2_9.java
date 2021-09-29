package Lab_Unit_2;

public class Lab_2_9 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] sum=new int[3][3];
		int[][] mul=new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mul[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("Sum of Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==========================");
		System.out.println("Multiplication of Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
