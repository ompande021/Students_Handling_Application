package colleges;

import java.util.Arrays;
import java.util.Scanner;

public class Student 
{
	Department d1;
	
	public static void main (String []args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("_____JSPM COLLEGE_____");
		System.out.print("Enter how many Student data you want insert:");
		int n =s.nextInt();
		
		Department d1[]=new Department[n];
		for(int i=1; i<=d1.length;i++)
		{
			System.out.println(i+".");
			System.out.println("Enter Student name: ");
			String sname=s.next();
			
			System.out.println("Enter student ID (roll no.): ");
			int id=s.nextInt();
			
			System.out.println("Enter student department: ");
			String dpt=s.next();
			
			d1[i-1]=new Department(sname,id,dpt);
			System.out.println("------------------");
		}
		
		Arrays.sort(d1);
		System.out.println("Data saved....\n------------------");
		
		boolean exit=true;
		do
		{
			System.out.println("1. Display all studends details \n2. Search student details in system \n3. Exit");
			int a=s.nextInt();
			if(a==1)
			{
				for(int j=0; j<d1.length;j++)
				{
					System.out.println(j+1+".");
					System.out.println(d1[j]);
				}
			}
			else if(a==2)
			{
				System.out.println("Enter Student Id: ");
				int d=s.nextInt();
				int z=0;
				for(int k=0;k<d1.length;++k)
				{
					if(d==d1[k].Sid)
					{
						System.out.println("The student details are..\n"+d1[k]+"\n");
						z=d;
					}	
				}
				if(z==d)
				{
					
				}
				else
				{
					System.out.println("Entered data is not present in system\n");
				}
				
			}
			else
			{
				exit=false;
			}
		}
		while(exit);
		
	}
}
			
		
		

	

