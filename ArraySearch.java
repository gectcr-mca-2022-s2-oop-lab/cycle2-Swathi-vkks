package swathicycle1;

import java.util.*;

public class ArraySearch {
	public static void main(String args[]) {
		int flag=0;
		int pos=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = s.nextInt();
		int array[] = new int[n];
    System.out.println("enter" + n +" elements in array");
		for (int i = 0; i < n; i++) {
          array[i]=s.nextInt();
		}
	System.out.println("enter the key to search");
	int key=s.nextInt();
	for(int i=0;i<n;i++)
	{
		pos++;
     if(key==array[i]) {
    	 flag=1;
    	 break;
    	 
     }
	}
	if(flag==0)
		System.out.println("the element not found");
	else
	  System.out.println("element found at the"+pos+"position");
	 
	}
}
