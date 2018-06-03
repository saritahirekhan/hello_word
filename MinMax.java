package test;
import java.util.*;
public class MinMax {
		public static int MaxValue(int[] a) {
			int maxvalue=a[0];
			for(int i=0;i<a.length;i++) {
				//maxvalue=a[i];
				if(a[i]>maxvalue) {
					maxvalue=a[i];
					System.out.println(maxvalue);
				}
			}
			return maxvalue;
			//System.out.println(maxvalue);

		}
		public static int MinValue(int [] a) {
			int minvalue=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]<minvalue) {
					minvalue=a[i];
				}
			}
			return minvalue;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter element into array");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();		
			}
	
	System.out.println("display array element:");
	//System.out.println(arr[]);---->gives garbage value
	for(int i:arr) {
		System.out.print(i+" ");
	}
	//MinMax m=new MinMax();
	int b=MaxValue(arr);
	System.out.println("max value is:"+b);
	int c=MinValue(arr);
	System.out.println("min value is: "+c);
	}
	//private int MaxValue(int i) {
		// TODO Auto-generated method stub
	//	return 0;
	//}

}
