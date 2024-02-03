package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		//sumOfArray

	   /* int a[]={12,15,17,14,11,12,15,10};
		int sum=0;

		for(int i=0; i<a.length; i++)
		{
		 sum=sum+a[i];
		}
		System.out.println(sum); */
		
		//sortingElement
		/*int a[]={12,15,17,14,11,12,15,10};

		System.out.println("array before sorting: " +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("array after sorting: " +Arrays.toString(a)); */
		
		//linearSearch
	/*	int a[]={12,15,17,14,11,12,15,10};
		int search_elem=12;
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		 if(search_elem==a[i])
		 {
		  System.out.println("Element found at: "+ i);
		  flag=true;
		 }
		}
		if(flag==false)
		{
		   System.out.println("Element not found");
		} */
		
		//findMinAndMax
	/*	int a[]={18,15,17,14,11,12,15,10};
		int max=a[0];

		for(int i=0; i<a.length; i++)
		{
		 if(a[i]>max)
		 {
		  max=a[i];
		 }
		}
		 System.out.println("maximum number: "+ max);

		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
		 if(a[i]<min)
		 {
		  min=a[i];
		 }
		}
		 System.out.println("minimum number: "+min); */
		
		//findMissingNumber
	/*	int a[]={10,11,12,13,15,16};
		int sum1=0;
		int sum2=0;

		for(int i=0; i<a.length; i++)
		{
		 sum1=sum1+a[i];
		}
		System.out.println(sum1);

		for(int i=10; i<=16; i++)
		{
		 sum2=sum2+i;
		}

		System.out.println("missing number: "+ (sum2-sum1)); */
		
		//findEvenOddInArray
	/*	int a[]={10,11,12,13,15,16};
		int even_count=0, odd_count=0;

		for(int i=0; i<a.length; i++)
		{
		 if(a[i]%2==0)
		 {
		  even_count++;
		 }
		 else
		 {
		  odd_count++;
		 }
		}
		System.out.println("number of even digits: "+even_count);
		System.out.println("number of odd digits: "+ odd_count); */
		
		//duplicateInArray
	/*	int a[]={12,15,17,14,11,12,15,10};
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		 for(int j=i+1; j<a.length; j++)
		 {
		  if(a[i]==a[j])
		  {
		   System.out.println("duplicate: "+a[i]); 
		   flag=true;
		  }
		 }
		}
		if(flag==false)
		{
		    System.out.println("no duplicates"); 
		} */
		
		//compareTwoArray
		/*int a[]={12,15,17,14,11,12,15,10};
		int b[]={12,15,18,14,11,12,15,10};

		boolean status=Arrays.equals(a,b);

		if(status==true)
		{
		 System.out.println("Arrays are equal");
		}
		else
		{
		 System.out.println("Arrays are not equal"); 
		} */
		
		//countWords
		/*String s="allah is the greatest";
		int count=1;

		for(int i=0; i<s.length()-1; i++)
		{
		 if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
		 {
		  count++;
		 }
		}
		System.out.println(count);
		
		//12-20-2023
		//factorial
		int num=5;
		long factorial=1;

		for(int i=1; i<=num; i++)
		{
		 factorial=factorial*i;
		}

		System.out.println(factorial); */
		
		//fibonacci
		/*int n1=0, n2=1, sum=0;

		System.out.print(n1+" "+n2);

		for(int i=2; i<=10; i++)
		{
		 sum=n1+n2;
		 System.out.print(" "+sum);
		 n1=n2;
		 n2=sum;
		} */
		
		//largest number
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: " );
		int a=sc.nextInt();

		System.out.println("Enter the value of b: " );
		int b=sc.nextInt();

		System.out.println("Enter the value of c: " );
		int c=sc.nextInt();

		if(a>b && a>c)
		{
		 System.out.println("a is the largest number");
		}
		else if(b>a && b>c)
		{
		 System.out.println("b is the largest number");
		}
		else
		{
		 System.out.println("c is the largest number");
		} */
		
		//random number
		/*Random rand=new Random();
		int rand_num=rand.nextInt();
		System.out.println(rand_num);
		int rand_num1=rand.nextInt(21);
		System.out.println(rand_num1); */
		
		//prime number
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();
		int count=0;

		if(num>1)
		{
		 for(int i=1; i<=num; i++)
		 {
		  if(num%i==0)
		  {
		   count++;
		  }
		 }
		 if(count==2)
		 {
		  System.out.println("number is prime");
		 }
		 else
		 {
		  System.out.println("number is not prime");
		 }
		}
		else
		{
		 System.out.println("num is not a prime number");
		} */
		
		//counting even and odds
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();

		int even_count=0;
		int odd_count=0;

		while(num>0)
		{
		 int rem=num%10;
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
		System.out.println("number of even number: "+even_count);
		System.out.println("number of odd number: "+odd_count); */
		
		//counting number
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();
		int count=0;

		while(num>0)
		{
		 num=num/10;
		 count++;
		}
		System.out.println(count); */
		
		//sum of digits
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();
		int sum=0;

		while(num>0)
		{
		 sum=sum+num%10;
		 num=num/10;
		 }
		System.out.println(sum); */
		
		//palindrome
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;

		while(num>0)
		{
		 rev=rev*10+num%10;
		 num=num/10;
		}
		System.out.println(rev);

		if(org_num==rev)
		{
		 System.out.println("palindrome number");
		}
		else
		{
		 System.out.println("not a palindrome number");
		} */
		
		//swapping number
		/*int a=10, b=20, c=0;

		c=a;
		a=b;
		b=c;
		
		System.out.println(a+" "+b); */
	/*	int a=10, b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b); */
		
		//sum of array
		/*int a[]={11,12,13,14,15,16};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
		 sum=sum+a[i];
		}
		System.out.println(sum); */
		
		//sorting element
	/*	int a[]={17,2,5,23,5,16};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); */
		
		//sorting
		/*int a[]={17,2,5,23,5,16};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a)); */
		
		//linearSearch
		/*int a[]={17,2,5,23,5,16};
		int search=17;
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		 if(search==a[i])
		 {
		  System.out.println("number found in index: "+i);
		  flag=true;
		 }
		}
		if(flag==false)
		{
		 System.out.println("number not found in index");
		} */
		
		//find max min
	/*	int a[]={17,2,5,23,5,16};
		int max=a[0];

		for(int i=0; i<a.length; i++)
		{
		 if(a[i]>max)
		 {
		  max=a[i];
		 }
		}
		System.out.println("max: "+max);
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
		 if(a[i]<min)
		 {
		  min=a[i];
		 }
		}
		System.out.println("min:"+min);*/
		
		//findMissingNum
		/*int a[]={11,12,13,15,16};
		int sum1=0, sum2=0;

		for(int i=0; i<a.length; i++)
		{
		 sum1=sum1+a[i];
		}
		System.out.println("sum1: "+sum1);

		for(int i=11; i<=16; i++)
		{
		 sum2=sum2+i;
		}
		System.out.println("missing number: "+(sum2-sum1)); */
		
		//evnoddsArray
		/*int a[]={17,2,5,23,5,16};
		int evn_count=0;
		int odd_count=0;

		for(int i=0; i<a.length; i++)
		{
		 if(a[i]%2==0)
		 {
		 evn_count++;
		 }
		 else
		 {
		 odd_count++;
		 }
		}
		System.out.println("number of evn digits: "+evn_count);
		System.out.println("number of odd digits: "+odd_count); */
		
		//duplicateInArray
	/*	int a[]={17,2,5,23,5,16};
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		 for(int j=i+1; j<a.length; j++)
		 {
		  if(a[i]==a[j])
		  {
		   System.out.println("duplicate found in index: "+i);
		   flag=true;
		  }
		 }
		}  
		if(flag==false)
		 {
		  System.out.println("duplicate not found");
		 } */
		
		//comparingTwoArray
		/*int a[]={17,2,5,23,5,16};
		int b[]={23,16,5,17,5,2};

		boolean status=Arrays.equals(a,b);

		if(status==true)
		{
		 System.out.println("Arrays are equal");
		}
		else
		{
		 System.out.println("Arrays are not equal");
		} */
		
		//bubble sort
		/*int a[]={23,16,5,17,5,2};
		int n=a.length;

		for(int i=0; i<n-1; i++)
		{
		 for(int j=0; j<n-1; j++)
		 {
		  if(a[j]>a[j+1])
		  {
		   int temp=a[j];
		   a[j]=a[j+1];
		   a[j+1]=temp;
		  }
		 }
		}
		System.out.println(Arrays.toString(a)); */
		//palindromeString
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st=sc.nextLine();

		String rev="";
		String org_st=st;
		int length=st.length();

		for(int i=length-1; i>=0; i--)
		{
		 rev=rev+st.charAt(i);
		}
		System.out.println(rev);

		if(org_st.equals(rev))
		{
		 System.out.println("Palindrome String");
		}
		else
		{
		 System.out.println("Not Palindrome String");
		} */
		
		//countCharacterOccurance
	/*	String s="Java programming language is used all over the world";

		int totalCount=s.length();
		int countAfterRemoval=s.replaceAll("a","").length();
		int count=totalCount-countAfterRemoval;

		System.out.println("number of a occured: "+count); */
		
		//countingUppercaseLowerCase
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st=sc.nextLine();

		int upperCase_count=0;
		int lowerCase_count=0;

		for(char c: st.toCharArray())
		{
		 if(Character.isUpperCase(c))
		 {
		   upperCase_count++;
		 }
		 else if(Character.isLowerCase(c))
		 {
		   lowerCase_count++;
		 }
		}
		System.out.println("number of upper case letters: "+upperCase_count);
		System.out.println("number of lower case letters: "+lowerCase_count);*/
		
		//countword
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		String value=sc.nextLine();

		int count=1;

		for(int i=0; i<value.length()-1; i++)
		{
		 if((value.charAt(i)==' ') && (value.charAt(i+1)!=' '))
		 {
		   count++;
		 }
		}
		System.out.println(count); */

		//countWordsInString
	/*	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scanner.nextLine();

		String [] string=str.split(" ");
		System.out.println(Arrays.toString(string));
		System.out.println("number of words: "+string.length); */
		
		//duplicateword
	/*	String str="s c b v ";
		Map <Character, Integer> charMap=new HashMap<>();

		char[] charArr=str.toCharArray();

		for(char keys: charArr)
		{
		  if(Character.isAlphabetic(keys))
		  {
		    if(charMap.containsKey(keys))
		    {
		      charMap.put(keys, charMap.get(keys)+1);
		    }
		    else
		    {
		      charMap.put(keys, 1);
		    } 
		  }
		}
		Set <Map.Entry<Character, Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		  if(entry.getValue()>1)
		  {
		    System.out.println(entry.getKey()+ ":" + entry.getValue());
		  }
		}
		 */
		
		//duplicate
		/*String str="allah is my creator, who has the control of the seven heaven and the earth";
		Map<Character, Integer> charMap=new HashMap<>();

		char[] charArr=str.toCharArray();
		for(char keys: charArr)
		{
		  if(Character.isAlphabetic(keys))
		  {
		    if(charMap.containsKey(keys))
		    {
		      charMap.put(keys,charMap.get(keys)+1);
		    }
		    else
		    {
		      charMap.put(keys, 1);
		    }
		  }
		}
		Set<Map.Entry<Character, Integer>> entrySet=charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		  if(entry.getValue()>1)
		  {
		    System.out.println(entry.getKey()+ ":" +entry.getValue());
		  }
		  else
		  {
		    System.out.println(entry.getKey()+":no duplicates");
		  }
		} */
		
		//removejunk
	/*	String s="&*^%??$%^&*^%^&*()(*&^!@ sbrnyn142gbnft57u5@grth";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s); */
		//removewidespace
	/*	String str="java is a programming language";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		//vowel
	/*	String a="I love Islam";
		 a=a.toUpperCase();
		 int count=0;
		 
		 for(int i=0; i<a.length(); i++)
		 {
		   if(isVowel(a.charAt(i)))
		   {
		    count++;
		   }
		 }
		 System.out.println("number of vowels: "+count); */

		//factorial
	/*	int factorial=1;
		int num=5;

		for(int i=1; i<=num; i++)
		{
		  factorial=factorial*i;
		}
		System.out.println(factorial); */
		
		//fibonacci
		/*int n1=0, n2=1, sum=0;
		System.out.print(n1+ " " +n2);

		for(int i=2; i<=10; i++)
		{
		  sum=n1+n2;
		  System.out.print(" "+sum);
		  n1=n2;
		  n2=sum;
		 }	*/
		
		//random number
	/*	Random rand=new Random();
		int rand_int=rand.nextInt();
		System.out.println(rand_int); */
		
		//palindrome
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int num=sc.nextInt();

		int rev=0;
		int org_num=num;

		while(num>0)
		{
		 rev=rev*10+num%10;
		 num=num/10;
		}
		System.out.println(rev);

		if(org_num==rev)
		{
		  System.out.println("palindrome num");
		}
		else
		{
		  System.out.println("not a palindrome num");
		} */
		
		//primenum
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int num=sc.nextInt();

		int count=0;

		if(num>1)
		{
		  for(int i=1; i<=num; i++)
		  {
		    if(num%i==0)
		    {
		      count++;
		    }
		  }
		 if(count==2)
		 {
		   System.out.println("prime number");
		 }
		 else
		 {
		   System.out.println("not prime number");
		 }
		}
		else
		{
		 System.out.println("not a prime number");
		} */
		
		//evenandodd
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int num=sc.nextInt();

		int even_count=0;
		int odd_count=0;

		while(num>0)
		{
		  int rem=num%10;
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
		System.out.println("num of even count: "+even_count);
		System.out.println("num of odd count: "+odd_count);  */
		
		//counting number
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int num=sc.nextInt();

		int count=0;

		while(num>0)
		{
		  num=num/10;
		  count++;
		}
		System.out.println(count); */
		
		//sumOfDigits
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int num=sc.nextInt();

		int sum=0;

		while(num>0)
		{
		 sum=sum+num%10;
		 num=num/10;
		}
		System.out.println(sum); */
		
		//sum of array
		/*int a[]={18,12,15,13,20,25,16};
		int sum=0;

		for(int i=0; i<a.length; i++)
		{
		 sum=sum+a[i];
		}
		System.out.println(sum);	*/
		
		//sorting
	/*	Integer a[]={18,12,15,13,20,25,16};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a)); */
		
		//maxmin
	/*	int a[]={18,12,15,13,20,25,16};
		int max=a[0];

		for(int i=0; i<a.length; i++)
		{
		  if(a[i]>max)
		  {
		    max=a[i];
		  }
		}
		System.out.println("max number: "+max);

		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
		  if(a[i]<min)
		  {
		    min=a[i];
		  }
		}
		System.out.println("min number: "+min); */
		
		//missingNumber
	/*	int a[]={11,12,13,14,16};

		int sum1=0, sum2=0, missing_num=0;

		for(int i=0; i<a.length; i++)
		{
		  sum1=sum1+a[i];
		}
		System.out.println("sum of array: "+sum1);

		for(int i=11; i<=16; i++)
		{
		  sum2=sum2+i;
		}
		System.out.println("sum of array: "+sum2);

		missing_num=sum2-sum1;
		
		System.out.println(missing_num); */
		
		//even and odds
	/*	int a[]={18,12,15,13,20,25,16};

		int even_count=0;
		int odd_count=0;

		for(int i=0; i<a.length; i++)
		{
		  if(a[i]%2==0)
		  {
		    even_count++;
		  }
		  else
		  {
		    odd_count++;
		  }
		}
		System.out.println("num of even count: "+even_count);
		System.out.println("num of odd count: "+odd_count);   */
		
		//duplicateElement
		/*int a[]={18,12,15,13,25,20,12,25,16};
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		  for(int j=i+1; j<a.length; j++)
		  {
		    if(a[i]==a[j])
		    {
		      flag=true;
		      System.out.println("duplicate in index: "+i+"="+a[i]);
		    }
		   }
		 }
		if(flag==false)
		{
		  System.out.println("no duplicate");
		} */
		
		//linearsearch
	/*	int a[]={18,12,15,13,25,20,12,25,16};
		int search=12;
		boolean flag=false;

		for(int i=0; i<a.length; i++)
		{
		  if(a[i]==search)
		  {
		    System.out.println("element found in: "+i);
		    flag=true;
		  }
		}
		if(flag==false)
		{
		  System.out.println("no element found");
		} */
		
		//compairingtwoArray
		/*int a[]={18,12,15,13,2,20,12,25,16};
		int b[]={18,12,15,13,25,20,12,25,16};

		boolean status=Arrays.equals(a,b);
		if(status==true)
		{
		  System.out.println("arrays are equal");
		}
		else
		{
		  System.out.println("arrays are not equal");
		}*/
		
		//bubblesort
		/*int a[]={18,12,15,13,25,20,12,25,16};
		int n=a.length;

		for(int i=0; i<n-1; i++)
		{
		  for(int j=0; j<n-1; j++)
		  {
		    if(a[j]>a[j+1])
		    {
		      int temp=a[j+1];
		      a[j+1]=a[j];
		      a[j]=temp;
		    }
		  }
		}
		System.out.println(Arrays.toString(a));
		*/
		
		//countwords
		/*String str="java programming language";
		int length=str.length();
		int after_lngth=str.replaceAll("a","").length();

		 int final_cnt=length-after_lngth;
		System.out.println("number of a:"+final_cnt); */
		
		//uppercase lowercase
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter a value: ");
		String str=sc.nextLine();

		int upper_case=0;
		int lower_case=0;
		char[] a=str.toCharArray();
		for(char c: a)
		{
		  if(Character.isUpperCase(c))
		  {
		    upper_case++;
		  }
		  else if(Character.isLowerCase(c))
		  {
		    lower_case++;
		  }
		}
		System.out.println("number of upper case: "+upper_case);
		System.out.println("number of lower case: "+lower_case); */
		
		//countWords
	/*	String a="welcome to jumanji";
		int count=1;

		for(int i=0; i<a.length()-1; i++)
		{
		  if((a.charAt(i)==' ') && (a.charAt(i+1)!=' '))
		  {
		    count++;
		  }
		}
		System.out.println(count); */
		
		//duplicate
	/*	String str="ABC ALEX LEE AND FOWL AXL";
		Map <Character, Integer> map=new HashMap<>();

		char[] chrArray=str.toCharArray();

		for(char c: chrArray)
		{
		  if(Character.isAlphabetic(c))
		  {
		    if(map.containsKey(c))
		    {
		      map.put(c, map.get(c)+1);
		    }
		    else
		    {
		      map.put(c,1);
		    }
		  }
		}
		Set <Map.Entry<Character, Integer>> entrySet= map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		  if(entry.getValue()>1)
		  {
		    System.out.println(entry.getKey() +":"+ entry.getValue());
		  }
		} */
		
		//vowelcount
	/*	String str="I love Java";
		str=str.toUpperCase();
		int count=0;

		for(int i=0; i<str.length(); i++)
		{
		  if(isVowel(str.charAt(i)))
		  {
		    count++;
		  }
		}
		System.out.println(count); */
		
		//factorial

	/*	int num=8;
		long factorial=1;
		for(int i=1; i<=num; i++)
		{
		  factorial=factorial*i;
		}
		System.out.println(factorial); */
		
		//fabonacci
		/*int n1=0, n2=1, sum=0;
		System.out.print(n1+ " " +n2);

		for(int i=2; i<=10; i++)
		{
		  sum=n1+n2;
		  System.out.print(" "+sum);
		  n1=n2;
		  n2=sum;
		} */
		
		//random
	/*	Random rand= new Random();
		int rand_num= rand.nextInt(5);
		System.out.println(rand_num); */
		
		//primenum
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();

		int count=0;
		if(num>1)
		{
		  for(int i=1; i<=num; i++)
		  { 
		    if(num%i==0)
		    {
		       count++;
		    }
		  }
		  if(count==2)
		  {
		    System.out.println("prime number");
		  }
		  else
		  {
		    System.out.println("number is not prime ");
		  }
		}
		else
		{
		  System.out.println("not a prime number");
		} */
		
		//even and odds
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();

		int even_count=0;
		int odd_count=0;

		while(num>0)
		{
		  int rem= num%10;
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
		System.out.println("number of even digits: "+ even_count++);
		System.out.println("number of odd digits: "+ odd_count++);*/
		
		//countingnumbers
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();

		int count=0;

		while(num>0)
		{
		  num=num/10;
		  count++;
		}
		System.out.println(count); */
		
		//sum of num
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num=sc.nextInt();

		int sum=0;
		while(num>0)
		{
		  sum=sum+num%10;
		  num=num/10;
		}
		System.out.println(sum); */
//----------------------------------------------
		//01/02/2024

		//factorial number

	/*	int num=5;
		int factorial=1;

		for(int i=1; i<=num; i++)
		{
		  factorial=factorial*i;
		}
		System.out.println(factorial); */

		//fabonacci
		/*int n1=0, n2=1, sum=0;

		System.out.print(n1+" "+n2);
		for(int i=0; i<=10; i++)
		{
		  sum=n1+n2;
		  System.out.print(" "+sum);
		  n1=n2;
		  n2=sum;
		} */
		
		//palindrome number
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();

		int rev=0;
		int org_num= num;

		while(num>0)
		{
		  rev=rev*10+num%10;
		  num=num/10;
		}
		System.out.println(rev);

		if(rev==org_num)
		{
		    System.out.print("palindrome number");
		}
		else
		{
		    System.out.print("not a palindrome number");
		} */
		
		//swapping number
	/*	int a=10, b=20, c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b); */
		
		//countEvenAndOdds
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();

		int count_even=0;
		int odd_count=0;

		while(num>0)
		{
		  int rem=num%10;
		  if(rem%2==0)
		  {
		    count_even++;
		  }
		  else
		  {
		    odd_count++;
		  }
		  num=num/10;
		}

		System.out.println("number of even numbers: "+count_even);
		System.out.println("number of odd numbers: "+odd_count); */
		
		//prime number
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();

		int count=0;

		if(num>1)
		{
		  for(int i=1; i<=num; i++)
		  {
		    if(num%i==0)
		    {
		      count++;
		    }
		  }
		  if(count==2)
		  {
		    System.out.println("number is prime number");
		  }
		  else
		  {
		    System.out.println("number is not a prime number");
		  }    
		}
		else
		{
		  System.out.println("not a prime number");
		} */
		
		//countingNumber
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();

		int count=0;

		while(num>0)
		{
		  num=num/10;
		  count++;
		}
		System.out.println(count); */
		
		//sumof digits
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=sc.nextInt();

		int sum=0;

		while(num>0)
		{
		  sum=sum+num%10;
		  num=num/10;
		}
		System.out.println(sum); */
		
		//sum of array
		/*int a[] = {10,15,17,13,9};
		int sum=0;

		for(int i=0; i<a.length; i++)
		{
		  sum=sum+a[i];
		}
		System.out.println(sum); */
		
		//sorting element
		/*int a[]={11,15,13,16,12,14};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); */
		
		//sorting element
		/*int a[]={11,15,13,16,12,14};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a)); */
		
		//linearSearch
	/*	int a[]={11,15,13,16,12,14};
		int search=12;
		boolean status=false;

		for(int i=0; i<a.length; i++)
		{
		  if(search==a[i])
		  {
		    System.out.println("Element found in index: "+i);
		    status=true;
		  }
		}
		if(status==false)
		{
		  System.out.println("Element not found");
		}*/
		
		//findmaxmin
	/*	int a[]={11,15,13,16,12,14};
		int max=a[0];

		for(int i=1; i<a.length; i++)
		{
		  if(a[i]>max)
		  {
		    max=a[i];
		  }
		}
		System.out.println(max);

		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
		  if(a[i]<min)
		  {
		    min=a[i];
		  }
		}
		System.out.println(min); */
		
		//missing num
	/*	int a[]={11,15,16,12,14};
		int sum=0, sum1=0, missingNum=0;

		for(int i=0; i<a.length; i++)
		{
		  sum=sum+a[i];
		}
		System.out.println(sum);

		for(int i=11; i<=16; i++)
		{
		  sum1=sum1+i;
		}
		System.out.println(sum1);
		missingNum=sum1-sum;
		System.out.println(missingNum); */
		
		//evenodds
	/*	int a[]={11,15,13,16,12,14};
		int count_even=0;
		int odd_count=0;

		for(int i=0; i<a.length; i++)
		{
		  if(a[i]%2==0)
		  {
		    count_even++;
		  }
		  else
		  {
		    odd_count++;
		  }
		}
		System.out.println("number of even numbers: "+count_even);
		System.out.println("number of odd numbers: "+odd_count); */
		
		//duplicate
	/*	int a[]={11,15,11,13,16,12,14};
		boolean status=false;

		for(int i=0; i<a.length; i++)
		{
		  for(int j=i+1; j<a.length; j++)
		  {
		    if(a[i]==a[j])
		    {
		      status=true;
		      System.out.println("duplicate element: "+a[i]);
		    }
		  }
		}
		if(status==false)
		{
		  System.out.println("no duplicate element");
		} */
		
		//comparingTwoArray
	/*	int a[]={11,15,13,16,12,14};
		int b[]={1,15,13,16,12,14};

		boolean status=Arrays.equals(a,b); 
		System.out.println(status); */
		
		//bubbleSort
		/*int a[]={11,15,13,16,12,14};
		for(int i=0; i<a.length-1; i++)
		{
		  for(int j=0; j<a.length-1; j++)
		  {
		    if(a[j]>a[j+1])
		    {
		      int temp= a[j];
		      a[j]=a[j+1];
		      a[j+1]=temp;
		    }
		  }
		}

		System.out.println(Arrays.toString(a)); */
		
		//vowelCount
		
		/*String str="I love u";
		str=str.toUpperCase();

		int count=0;

		for(int i=0; i<str.length(); i++)
		{
		  if(isVowel(str.charAt(i)))
		  {
		    count++;
		  }
		}
		System.out.println(count); */

		//reverseEachWord
	/*	String str="Welcome to java";

		String[] words=str.split(" ");
		String revString="";

		for(String w:words)
		{
		   String revWords="";
		   for(int i=w.length()-1; i>=0; i--)
		   {
		     revWords=revWords+w.charAt(i);
		   }
		   revString= revString+revWords+" ";
		}
		System.out.println(revString); */
		
	/*	String str="Welcome to java";
		String []words= str.split(" ");
		
		String revString="";
		
		for(String w:words)
		{
			String revWord="";
			for(int i=w.length()-1; i>=0; i--)
			{
				revWord=revWord+w.charAt(i);
			}
			revString=revString+revWord+" ";
		}

		System.out.println(revString); */
		
		//vowelcount
	/*	String str="WELCOME to java";
		str=str.toUpperCase();
		int count=0;

		for(int i=0; i<str.length(); i++)
		{
		  if(isVowel(str.charAt(i)))
		  {
		    count++;
		  }
		}
		System.out.println(count); */
		
		
		//reverseEachWord
	/*	String str="Welcome to java";
		String [] word= str.split(" ");

		String revString="";

		for(String w: word)
		{
		  String revWord= "";
		  for(int i=w.length()-1; i>=0; i--)
		  {
		     revWord=revWord+w.charAt(i);
		  }
		  revString=revString+ revWord +" ";
		}
		System.out.println(revString); */
		
		//remove whiteSpace
		/*String str="welcome to java";
		str=str.replaceAll(" ", "");
		System.out.println(str); */
		
		//removeJunk
	/*	String str="#@!@^%U*&^% avbgDRFGBsfvb 12345689987nth";
		str=str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str); */
		
		//duplicatechar
	/*	String str="java ia a programming language";

		Map <Character, Integer> charMap= new HashMap <>();

		char[] charArr= str.toCharArray();
		for(char key: charArr)
		{
		   if(Character.isAlphabetic(key))
		   {
		      if(charMap.containsKey(key))
		      {
		         charMap.put(key, charMap.get(key)+1);
		      }
		      else
		      {
		         charMap.put(key, 1);
		      }
		   }  
		}

		Set <Map.Entry<Character, Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		   if(entry.getValue()>1)
		   {
		      System.out.println(entry.getKey()+ ":" + entry.getValue());
		   }
		} */

		//count Duplicate character occurance
	/*	String data= "Java is a programing language";
		int count=data.length();

		int fCount= data.replaceAll("a","").length();
		int countAfterRemove=count-fCount;
		System.out.println("total occurance of a: "+countAfterRemove); */
		
		//count of uppercase
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		int upCount=0;
		int lwCount=0;

		for(char ch: value.toCharArray())
		{
		  if(Character.isUpperCase(ch))
		  {
		    upCount++;
		  }
		  else if(Character.isLowerCase(ch))
		  {
		    lwCount++;
		  }
		}

		System.out.println("number of upper case character: "+upCount);
		System.out.println("number of lower case character: "+lwCount); */
		
		//count words
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		int count=1;

		for(int i=0; i<=value.length()-1; i++)
		{
		  if((value.charAt(i)==' ') && (value.charAt(i+1)!=' '))
		  {
		     count++;
		  }
		}
		System.out.println("number of character: "+count); */
		
		//counting words
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		String [] a=value.split(" ");

		System.out.println(Arrays.toString(a));
		System.out.println(a.length); */
		
		
		//duplicate character
		/*printDuplicates("A");
		printDuplicates("");
		printDuplicates(null);
		printDuplicates("ANACONDA CONFRONT");
		printDuplicates("007 IS A JAMES BOND TAG NUMBER");

	}
	
		
		//duplicate character
		public static void printDuplicates(String str)
		{
		   if(str==null)
		   {
		      System.out.println("NULL String");
		      return;
		   }

		   if(str.isEmpty())
		   {
		      System.out.println("empty String");
		      return;
		   }

		   if(str.length()==1)
		   {
		      System.out.println("Single char String");
		      return;
		   }

		   char word[]=str.toCharArray();
		   Map <Character, Integer> charMap=new HashMap <>();

		   for(Character ch: word)
		   {
			  if(Character.isAlphabetic(ch))
			  {   
		      if(charMap.containsKey(ch))
		      {
		         charMap.put(ch, charMap.get(ch)+1);
		      }
		      else
		      {
		         charMap.put(ch, 1);
		      }}
		   }
		   Set <Map.Entry<Character, Integer>> entrySet =charMap.entrySet();
		   for(Map.Entry<Character, Integer> entry: entrySet)
		   {
		      if(entry.getValue() > 1)
		      {
		         System.out.println(entry.getKey()+ ":"+ entry.getValue());
		      }
		   }
		}*/
		
		//character occurance
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		int count=value.length();
		int totalCount=value.replaceAll("a", "").length();
		int fCount= count-totalCount;
		System.out.println(fCount); */
		
		//countUpperCase
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		int upCount=0;
		int lwCount=0;

		for(char c: value.toCharArray())
		{
		  if(Character.isUpperCase(c))
		  {
		     upCount++;
		  }
		  else if(Character.isLowerCase(c))
		  {
		     lwCount++;
		  }
		}
		System.out.println("number of upper case character: "+upCount);
		System.out.println("number of lower case character: "+lwCount); */
		
		//count word
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:" );
		String value=sc.nextLine();

		int count=0;

		String[] str=value.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println(str.length); */
		
		//swapping numbers

		/*int a=10, b=20, c=0;

		c=a;
		a=b;
		b=c;

		System.out.println("a: "+a+" b: "+b); */
		
		//2
	/*	int a=10, b=20;

		a=a+b; //10+20=30
		b=a-b; //30-20=10;
		a=a-b; //30-10=20;
		System.out.println("a: "+a+" b: "+b);*/
		
		//3
		/*int a=10, b=20;

		a=a*b; //10*20=200;
		b=a/b; //200/20=10;
		a=a/b; //200/10=20;
		System.out.println("a: "+a+" b: "+b); */
		
		//printNumber

		/*int one='a'/'a';
		String set="..........";

		for(int i=one; i<=set.length() * set.length(); i++)
		{
		  System.out.println(i); 	
		}*/
		
		//countCharacterOccurance
	/*	String a="java is my favorite programming language";

		int count=a.length();
		int partialCount= a.replaceAll("a","").length();
		int finalCount = count- partialCount;

		System.out.println("number of times a occured: "+finalCount); */
		
		//countUppercaseLowercase
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String value= sc.nextLine();

		int upCount=0;
		int lwCount=0;

		for(char r: value.toCharArray())
		{
		  if(Character.isUpperCase(r))
		  {
		    upCount++;
		  }
		  else if(Character.isLowerCase(r))
		  {
		    lwCount++;
		  }
		}
		System.out.println("number of uppercase: "+upCount);
		System.out.println("number of lowercase: "+lwCount); */
		
		//countUpperCaseLowerCase
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		String st=sc.nextLine();

		int upCount=0;
		int lwCount=0;

		for(char c: st.toCharArray())
		{
		  if(Character.isUpperCase(c))
		  {
		    upCount++;
		  }
		  else if(Character.isLowerCase(c))
		  {
		    lwCount++;
		  }
		}
		System.out.println("number of uppercase: "+upCount);
		System.out.println("number of lowercase: "+lwCount); */
		
		//numberOfwords
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		String st=sc.nextLine();

		String [] word = st.split(" ");
		System.out.println(Arrays.toString(word));
		System.out.println("number of word: "+word.length); */
		
		//numberOfWord
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		String st=sc.nextLine();

		String [] word=st.split(" ");

		System.out.println(Arrays.toString(word));
		System.out.println("number of word: "+word.length); */
		
		//duplicate character
	/*	String str="Java is the most popular programming language";
		Map <Character, Integer> map= new HashMap<>();

		char[] charArray= str.toCharArray();

		for(char c : charArray)
		{
		  if(Character.isAlphabetic(c))
		  {
		    if(map.containsKey(c))
		    {
		      map.put(c, map.get(c)+1);
		    }
		    else
		    {
		      map.put(c, 1);
		    }
		  }
		}

		Set <Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		  if(entry.getValue()>1)
		  {
		    System.out.println(entry.getKey()+" : "+ entry.getValue());
		  }
		}*/
		
		//duplicateCharacter
		/*String str="Java is the most popular programming language";
		Map<Character, Integer> map= new HashMap<>();

		char[] charArray = str.toCharArray();

		for(char c: charArray)
		{
		   if(Character.isAlphabetic(c))
		   {
		     if(map.containsKey(c))
		     {
		        map.put(c, map.get(c)+1);
		     }
		     else 
		     {
		        map.put(c, 1);
		     }
		   }
		}

		Set <Map.Entry<Character, Integer>> entrySet= map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		   if(entry.getValue()>1)
		   {
		      System.out.println(entry.getKey()+" : "+entry.getValue());
		   }
		} */
		
		//removejunk
		/*String str="!@#$%Z^& A@#vil 134@#12#$456";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);*/
		
		//removewideSpace
	/*	String str="Java string is a variable";
		str=str.replaceAll("\\s","");
		System.out.println(str); */
		
		//reverse each word
		/*(String str="java is a programming language";
		String[] word=str.split(" ");
		String revString="";

		for(String w: word)
		{
		   String revWord="";
		   for(int i=w.length()-1; i>=0; i--)
		   {
		     revWord=revWord+w.charAt(i);
		   }
		   revString= revWord+ " " +revString;
		}
		System.out.println(revString); */
		
		//reverse each word
		/*String str="java is a programming language";
		String[] word=str.split(" ");
		String revString="";

		for(String w: word)
		{
		   String revWord="";
		   for(int i=w.length()-1; i>=0; i--)
		   {
		      revWord= revWord+w.charAt(i);
		   }
		   revString = revWord+" "+ revString;
		}
		System.out.println(revString); */
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

	//printNumber

	/*public static void printNum(int num)
	{
	  if(num<=100)
	  {
	     System.out.println(num);
	     num++;
	     printNum(num); //recursive
	  }
	}*/

	/*public static void printNum(int sNum, int endNum)
	{
	  if(sNum<=endNum)
	  {
	    System.out.println(sNum);
	    sNum++;
	    printNum(sNum, endNum);
	  }
	} */
	
	//printnum

	public static void printNum(int num)
	{
	  if(num<=15)
	  {
	    System.out.println(num);
	    num++;
	    printNum(num);
	  }
	}











		
		
		
		
		



		 
		
		
		
	
	
	/*public static boolean isVowel(char t)
	{
	  return t=='A' || t=='E' || t=='I' || t=='O' || t=='U';
	} */
	
	

	
	
}