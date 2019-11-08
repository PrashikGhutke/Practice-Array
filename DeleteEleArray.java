import java.util.Scanner ;
class DeleteEleArray
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
	
	void delEle(int n,int s)
	{
		loc = n - 1 ;
		for(int i =loc ;i< s ; i++)
		{
			a[i] = a[i+1] ;
		}
		for(int i =0 ;i <s-1 ;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
	//Main Method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DeleteEleArray  obj = new DeleteEleArray();
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
		obj.delEle(obj.loc,n);
		
	}
		
}
		