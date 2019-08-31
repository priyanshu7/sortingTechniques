package sorting;

public class InsertionSort {
	
	public void sortAndShow(int[] arr){
		for (int i = 1; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j-1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j = j-1;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,1,23,99,21,43,12,0,3,9};
		InsertionSort is = new InsertionSort();
		is.sortAndShow(nums);
	}

}
