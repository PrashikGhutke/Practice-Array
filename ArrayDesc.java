import java.util.Scanner ;
class ArrayDesc
{
	int a[] = new int[100];
	
	//Display The Data
	void show(int []a,int n )
	{
		for(int i =0 ;i <n ;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void sortArray(int n)
	{
		for(int i = 0 ;i<n ;i++)
		{
			for(int j = i +1 ; j < n ; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayDesc  obj = new ArrayDesc();
		System.out.println("Enter the Data");
		int n = sc.nextInt(); // Size of the Array
		
		for(int i = 0 ;i<n ;i++)
		{
			obj.a[i]  = sc.nextInt();
		}
		obj.show(obj.a,n);
		obj.sortArray(n);
		System.out.println();
		obj.show(obj.a,n);
	}
}