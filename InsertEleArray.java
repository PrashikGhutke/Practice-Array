import java.util.Scanner ;
class InsertEleArray
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
	
	void insertData(int n,int size)
	{
		int i,temp = loc ;
		temp = loc -1 ;
		for(i = size ; i > temp ;i--)
		{
			a[i] = a[i-1] ;
		}
		a[i] = n ;
		System.out.println(a[i]+"LOC"+loc);			
		for(int j =0 ;j <=size ;j++)
		{
			System.out.println();
			System.out.print(a[j]+" ");
		}
		
	}
	
	//Main Method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InsertEleArray  obj = new InsertEleArray();
		System.out.println("Enter the Data");
		int n = sc.nextInt(); // Size of the Array
		
		for(int i = 0 ;i<n ;i++)
		{
			obj.a[i]  = sc.nextInt();
		}
		obj.show(obj.a,n);
		
		System.out.println();
		 		System.out.println("Enter The Location");
		 obj.loc = sc.nextInt();
		 System.out.println("ENter The Data U Want To Enter");
		 int data = sc.nextInt();
		 obj.insertData(data,n);
	}
}