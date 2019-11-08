import java.util.Scanner ;
class ArrayHighest
{
	int a[] = new int[100];
	void getData(int a[],int n)
	{
				System.out.println("Display Data");
				for(int i = 0 ;i<n;i++ )
				{
					System.out.print(a[i]+" ");
				}
	}
	void sortArray(int a[],int n)
	{
		for(int i =0;i<n;i++)
		{
			for(int j = i+1 ; j<n;j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp ;
				}
			}
		}
	}
	void highNo()
	{
		System.out.println(a[0]+" "+a[1]);
	}
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The Number");		
		int n = sc.nextInt();
		ArrayHighest obj = new ArrayHighest();
		for(int i = 0 ; i<n;i++)
		{
			obj.a[i] = sc.nextInt();
		}
		
		
		obj.getData(obj.a,n);
		obj.sortArray(obj.a,n);
		obj.getData(obj.a,n);
		System.out.println();
		obj.highNo();
	}
	}
	
		
			
	