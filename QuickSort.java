package sorting;

public class QuickSort {
	
	private int[] array;
	
	public QuickSort(int[] array) {
		this.array = array;
	}
	
	public void quicksort(int low, int high) {
		if (low>=high) return;
		int pivot;
		pivot = partition(low,high);
		quicksort(low,pivot-1);
		quicksort(pivot+1,high);
	}
	
	private int partition(int low, int high) {
		
		int pivotindex = (low+high)/2;
		swap(pivotindex,high);
		int i = low;
		for(int j = low; j<high;++j)
			if(array[j] <= array[high]) {
				swap(i,j);
				i++;
			}
		swap(i,high);
		return i;
	}
	
	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void showArray() {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+"  ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {45,12,-90,34,12,47,78,12,64,0};
		QuickSort qs = new QuickSort(nums);
		qs.quicksort(0,nums.length-1);
		qs.showArray();

	}

}
