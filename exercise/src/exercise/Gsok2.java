package exercise;

import java.util.Arrays;
import java.util.Scanner;


public class Gsok2 {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gsok2 exe = new Gsok2();

exe.display();
int g = in.nextInt();

switch(g)
{
case 1:

	exe.num1();
  break;

case 2:  
	exe.num2();
	  break;
  
case 3:
	exe.num3();
	 break;


case 4:
	
	exe.num4();
	
	 
	   break;
case 5:
	
	exe.num5();
	 break;
	
case 6:
	
	exe.num6();
	 break;
	

case 7:
	
	exe.num7();
	 break;
	
}


	}
	
	
	//display
	public void display()
	{
		 System.out.println("----MENU-----");
		 System.out.println("press the number & the enter Key to view selection");
		 System.out.println("1. Exercise One");
		 System.out.println("2. Exercise Two");
		 System.out.println("3. Exercise Three");
		 System.out.println("4. Exercise Four");
		 System.out.println("5. Exercise Five");
		 System.out.println("6. Exercise Six");
		 System.out.println("7. Exercise Seven");
		 
	}
	
	
	
	//returns angle of time
	public void num1()
	{
		int angle= 6; //1 min is 6degrees
		int min = 5; //
		
		System.out.println("Enter a hour: ");
		int hour = in.nextInt();
		System.out.println("Enter a minute: ");
		int minutes = in.nextInt();
		
		
		int hourangle = hour*min*angle;//gets the angle from 0 or 12
		int minuteangle = minutes*6; // gets the angle of the minutes from 12 hour mark
		
		if (hourangle>minuteangle)
		{
			int angle1 = hourangle-minuteangle;
			System.out.println("first angle :" +angle1);
			System.out.println("second angle : "+ (360-angle1));
		}else if(minuteangle > hourangle)
		{
			int angle2 = minuteangle-hourangle;
			System.out.println("first angle :" +angle2);
			System.out.println("second angle : "+ (360-angle2));
		}else if(hourangle==minuteangle)
		{
			System.out.println("angle 0" );	
		}
		
		
	}
	
	// reversing each word in a string trimming spaces
		public void num2()
		{ 
			 String string="string";
			 String s2 = string;
		      String trim = new StringBuffer(s2).
		      reverse().toString();
		      System.out.println("before:"+s2);
		      System.out.println("reverse:"+trim);
		}

	//routine for reversing each word in a string
	public void num3()
	{ System.out.println("Enter a string: ");
		 String string=in.nextLine();
	      String rev = new StringBuffer(string).
	      reverse().toString();
	     
	      System.out.println("reverse:"+rev);
	}
	
	//sorting characters in a string
	public void num4()
	{
		String str = "abrzdhyj";
		char[] arr = str.toCharArray();
		System.out.print("string : ");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i]);
		System.out.println();

		 Arrays.sort(arr); // sorted in ascending order
		 System.out.print("sorted ascending string   :  ");
		 for(int i = 0; i < arr.length; i++) System.out.print(arr[i]);
			System.out.println();
		 
		 
		// print them backwards i.e. descending order.
			System.out.print("sorted descending string  : ");
		for(int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i]);
		System.out.println();
		
	}
	
	
	//prime numbers
	public void num5()
	{
		int num = 500;
		int iterating = 0;
		int option;
		System.out.println("choose option");
		System.out.println("1. Default 500 numbers");
		System.out.println("2. customize");
		option = in.nextInt();
		switch(option)
		{
		case 1:
		
		for(iterating=0;iterating<=num;iterating++)
		{
			if(iterating%2==0)
			{
				System.out.println(""+iterating);
			}
		}
		
		break;
		case 2:
			
			System.out.println("enter range");
			int x = in.nextInt();
			num = x;
			for(iterating=0;iterating<=num;iterating++)
			{
				if(iterating%2==0)
				{
					System.out.println(""+iterating);
				}
			}
			
			break;
			
			
		}
		
	}
	
	//recursive mean
	public void num6()
	{
		int start = 0;
		recurse(start);
	}
	
	public void recurse(int a)
	{int u = 500;
		if(a<=500){
		 if(a%2==0)
		 {
			 System.out.println(""+a);
			 a++;
			 recurse(a);
		 }
		 else{
			 a++;
			 recurse(a); 
		 }
		 
		 
		}
	}
	
	
	
	//determining second largest and the greatest numbers in an array
	public void num7()
	{
		int[] array = new int[10];
		//enter ten numbers
		for(int count = 0; count<10;count++)
		{
		System.out.println("Enter a number");
		array[count] = in.nextInt();
		}
		
		//array sorting
		int i, j, max;
		for(i=0;i<10;i++)
		{
			max = i;
			for(j=i+1;j<10;j++)
			{
				if(array[j]<array[max])
					max=j;
			}
			int temp = array[i];
			array[i]=array[max];
			array[max]=temp;
		}
		
		//display
		{
			System.out.println(" second lowest"+ array[1]); //second lowest in the sorted array
			System.out.println("largest"+ array[9]); //largedt number in the sorted array
		}
		
		
	}
	
	
}
