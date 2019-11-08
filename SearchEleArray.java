import java.util.Scanner ;
class SearchEleArray
{
	int a[] = new int[100];
	int loc ; 
	//Display The Data
	void show(int []a,int n )
	{
		for(int i =0 ;i <n ;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	void findData(int d,int s)
	{
		int flag = 0 ;
		for(int i = 0; i < s ;i++)
		{
			if(a[i] == d )
			{
				System.out.println(d+"Data FOund AT  = "+(i+1));
				flag = 1;
				break ;
			}
		}
		if(flag == 0)
		{
			System.out.println("Data Not Found ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		SearchEleArray  obj = new SearchEleArray();
		System.out.println("Enter the Data");
		int n = sc.nextInt(); // Size of the Array
		
		for(int i = 0 ;i<n ;i++)
		{
			obj.a[i]  = sc.nextInt();
		}
		obj.show(obj.a,n);
		
		System.out.println("ENter The Data U Want To FInd");
		int data = sc.nextInt();
		obj.findData(data,n);
		
		
	}
}