import java.util.Scanner;
class MultiNationalCompany
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		MultiNationalCompany n=new MultiNationalCompany();
		n.menu();

	}
	void menu()
	{
		boolean exit=true;
		System.out.print("Enter the size of an array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" Employee ID :");
			ar[i]=sc.nextInt();
		}
		do
		{
			System.out.println("*****WELCOME*****");
			System.out.println("1.Add Employee ID");
			System.out.println("2.Remove Employee ID");
			System.out.println("3.Display Employee ID");
			System.out.println("4.Exit");
			System.out.println("Enter your Option :");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
				{
					ar=add(ar);
					break;
				}
				case 2:
				{
					ar=remove(ar);
					break;
				}
				case 3:
				{
					display(ar);
					break;
				}
				case 4:
				{
					exit=false;
					break;
				}
			}
		}while(exit);
		
	}
	int[] add(int arr[])
	{
		System.out.println("Enter the position to be added :");
		int position=sc.nextInt();
		System.out.println("Enter the ID to be added :");
		int ID=sc.nextInt();
		int ar[]=new int[arr.length+1];
		for(int i=0;i<position-1;i++)
		{
			ar[i]=arr[i];
		}
		ar[position-1]=ID;
		for(int i=position;i<ar.length;i++)
		{
			ar[i]=arr[i-1];
		}
		System.out.println("Employee ID ADDED "+ar[position-1]);
		return ar;
	}
	int[] remove(int arr[])
	{
		System.out.println("Enter the position to be removed :");
		int position=sc.nextInt();
		int ar[]=new int[arr.length-1];
		for(int i=0;i<position-1;i++)
		{
			ar[i]=arr[i];
		}
		for(int i=position-1;i<ar.length;i++)
		{
			ar[i]=arr[i+1];
		}
		System.out.println("Employee ID REMOVED "+arr[position-1]);
		return ar;
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The "+(i+1)+" Employee ID :"+arr[i]);
		}
	}
}