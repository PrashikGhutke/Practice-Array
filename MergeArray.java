import java.util.Scanner ;
class MergeArray
{
	int a[] = new int[100];
	int b[] = new int[100];
	int c[] = new int[100];
	
	void setArray(int size,int n,int m)
	{	int k = 0;
		for(int i = 0 ; i < n ;i++)
		{
			c[i] = a[i] ;
			k++;
		}
		System.out.println("K VALue"+k);
		for(int i = 0 ; i < size ;i++)
		{
			c[k] = b[i] ;
			k++;
		}
		System.out.println("3rd Array ");
		
		for(int i = 0 ; i<size ; i++)
		{
			System.out.println(c[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		MergeArray obj = new MergeArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size");
		int n = sc.nextInt();
		System.out.println("Enter The Data");
		for(int i = 0 ; i < n ; i++)
		{
			obj.a[i] = sc.nextInt();
		}
		System.out.println("2nd Array ");
		
		System.out.println("Enter The Size");
		int m = sc.nextInt();
		System.out.println("Enter The Data");
		
		for(int i = 0 ; i < m ; i++)
		{
			obj.b[i] = sc.nextInt();
		}
		int tsize = n + m ;
		obj.setArray(tsize,n,m);
		
	}
}
	