package test;

public class SecondMinMax {

	public static void main(String[] args) {
		int arr[]={8,3,4,5,11,2};
		int min=arr[0];
		int secmin=arr[0];
		int max=arr[0];
		int secmax=arr[0];
		for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		
		}
		System.out.println("minimum value is:"+min);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>min && arr[i]<secmin) {
				secmin=arr[i];
			}
		}
		System.out.println("second min valueis:"+secmin);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<max && arr[i]>secmax) {
					secmax=arr[i];
				}
	}
			System.out.println("maximuM value is:"+max);
			System.out.println("second highest value:"+secmax);

}
}
