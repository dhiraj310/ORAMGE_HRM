package pageObjects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class PracticeSelenium {
	static String str="Dheeraj";
	static String reverse="";
	
	
	
	
	
	public static void reverseString()
	{
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String are: "+reverse);
	}
	
	
	public static void main(String [] args)
	{
		//reverseString();
		//reverseNumber();
		//checkPalindrome();
		//checkStringPalindrome();
		//sumOfNumber();
		//findOddAndEven();
		//printFabonacci();
		//printFactorial();
		//sumofArray();
		//findOddEvenArray();
		//verifyequalArray();
		//findMissingNumber();
		//findMaxandMin();
		findDublicateValue();
	}
	
	public static void reverseNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println("Reverse number is : "+rev);
		
		
	}
	
	public static void checkPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		
		if(org_num==rev)
		{
			System.out.println("Given number is palindrome number");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
	
	
	
	public static void checkStringPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		
		String org_str=s;
		
		String rev="";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse number is :" +rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("Given string is palindrome number");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
	
	public static void sumOfNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum + num%10;
			num=num/10;
		}
		System.out.println("Sum of the number is : " +sum);
	}
	
	public static void findOddAndEven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int rem=0;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			rem=num%10;  //1234
			if(rem%2==0)
			{
				even_count++;
				
			}
			else
			{
				odd_count++;
				
			}
			num=num/10;
			
		}
		System.out.println("Total Evene number is :"+even_count);
		System.out.println("Total odd number is :"+odd_count);
	}
	
	public static void printFabonacci()
	{
		int n1=0;
		int n2=1;
		int sum;
		
		System.out.print(n1+ " " +n2);
		
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	
	
	public static void printFactorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print factorial");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is :"+fact);
	}
	
	
	public static void sumofArray()
	{
		int a[]= {5,4,3,2,1};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of Array number is :" +sum);
	}
	
	public static void findOddEvenArray()
	{
		int a[]= {5,4,6,7,9};
		System.out.println("Even number from array is..");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd number from array is..");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println(a[i]);
			}
		}
			
	}
	
	public static void verifyequalArray()
	{
		int a1[]= {2,3,4,5};
		int a2[]= {2,3,4,5};
		
      /*boolean status= Arrays.equals(a1, a2);
      
      if(status==true)
      {
    	  System.out.println("Arrays are equals");
      }
      else 
      {
    	  System.out.println("Arrays are not equals");
      }*/
		
		
		boolean status=true;
		if(a1.length==a2.length)
		{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i] !=a2[i])
			{
				status=false;
			}
		}
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equals");
		}
      
	}
	
	public static void findMissingNumber()
	{
		int a1[]= {32,33,34,36};
		int sum1=0;
		
		for(int i=0;i<a1.length;i++)
		{
			sum1=sum1+a1[i];
		}
		System.out.println("Sum of Elements is :"+sum1);
		
		int sum2=0;
		
		for(int i=32;i<=36;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of Range is :"+sum2);
		
		System.out.println("Misssing number is:"+(sum2-sum1));
	}
	
	public static void findMaxandMin()
	{
		int a1[]= {30,40,50,20,10};
		
		int max=a1[0];
		
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]>max)
			{
				max=a1[i];
			}
			
		}
		System.out.println("Maximum Number of array is :"+max);
		
		int min=a1[0];
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]<min)
			{
				min=a1[i];
			}
			
		}
		System.out.println("Minimum number of an array is: "+min);
	}
	
	public static void findDublicateValue()
	{
		String arr[]= {"java","python","c","java"};
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element found :"+arr[i]);
					status=true;
				}		
			}
			
		}
		
		if(status==false)
		{
			System.out.println("Dublicate value not found");
		}
	}
	
	

}
