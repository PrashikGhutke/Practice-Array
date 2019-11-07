import java.util.Scanner ;
class ArrayEvenOddSum
{
	static int j=0,k=0 ;
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
		 ;
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
	
	void arraySum()
	{
		int esum = 0, osum = 0;
		for(int i = 0;i<j ; i++)
		{
			esum = esum + even[i] ;
		}
		for(int i = 0;i<k ; i++)
		{
			osum = osum + odd[i] ;
		}
		System.out.println("Total Even ="+esum);
		System.out.println("TotalOdd ="+osum);		
	}
		
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		ArrayEvenOddSum obj = new ArrayEvenOddSum();
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
		System.out.println("SUM OF VARIABLES");
		
		obj.arraySum();
		
	}
}