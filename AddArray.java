import java.util.Scanner;
class AddArray
{
	int a[] = new int[100];
	void show(int a[],int n)
	{
		System.out.println("DISPLAY DATA");
		for(int i =0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void addData(int a[],int n)
	{
		int sum = 0;
		System.out.println();
		for(int i = 0 ;i<n;i++)
		{
			sum = sum + a[i] ;
		}
		System.out.println("Total = "+sum);
	}
	public static void main(String args[])
	{
		AddArray obj = new AddArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of An ARRAY");
		int n =  sc.nextInt();
		System.out.println("Enter The Data");
		for(int i =0;i< n;i++)
		{
			obj.a[i] = sc.nextInt();
		}
		obj.show(obj.a,n);
		obj.addData(obj.a,n);
	}
		
}