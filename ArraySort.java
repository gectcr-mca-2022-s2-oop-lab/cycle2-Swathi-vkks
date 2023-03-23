package swathicycle1;
import java.util.*;

public class ArraySort {
public static void main(String args[]) {
	int temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements in array");
	int n=s.nextInt();
	int array[]=new int[n];
	System.out.println("enter the" +n+ " elements");
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
			
		}
	    for(int i=0;i<n;i++) {
	    	for(int j=i+1;j<n;j++) {
	    		if(array[i]>array[j]) {
	    			temp=array[i];
	    			array[i]=array[j];
	    			array[j]=temp;
	    		}
	    	}
	    }
	    System.out.println("sorted array is:");
	    for(int i=0;i<n;i++)
	   
	    System.out.println(array[i]);
			
	
	
}
	

}
