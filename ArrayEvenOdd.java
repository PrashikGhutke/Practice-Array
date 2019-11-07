import java.util.Scanner ;
class ArrayEvenOdd
{
	int a[] = new int[100];
	int even[] = new int[100];
	int odd[] = new int[100] ;
	int ecount = 0;
	int ocount = 0;
	void show(int a[],int n)
	{
		for(int i = 0;i< n ;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Even Odd");
	}
	void evenOdd(int a[],int n)
	{
		int j=0,k=0 ;
		for(int i = 0;i<n;i++)
		{
		if(a[i]%2==0 )
		{
			even[j] = a[i] ;
			
			j++;
			ecount++;
		}
		else
		{
			odd[k] = a[i] ;
			k++;
			ocount++;
		}
	}
	System.out.println("ENter i"+j);
	System.out.println("ENter k"+k);
	}
	
	void showEvenOdd()
	{
		System.out.println("EVEN = "+ecount);
		for(int i = 0;i<ecount ;i++)
		{
			System.out.println(even[i]+" ");
		}
		System.out.println("ODD");
		for(int i = 0;i<ocount ;i++)
		{
			System.out.println(odd[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		ArrayEvenOdd obj = new ArrayEvenOdd();
		System.out.println("ENter The Size");
		int n = sc.nextInt();
		System.out.println("ENter The Data");
		for(int i = 0;i<n ;i++)
		{
			obj.a[i] = sc.nextInt();			
		}
		obj.show(obj.a,n);
		obj.evenOdd(obj.a,n);
		obj.showEvenOdd();
	}
}