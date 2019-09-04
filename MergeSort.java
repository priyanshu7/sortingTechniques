package sorting;

public class MergeSort {
	
	private int[] array;
	private int[] tempArray;
	
	public MergeSort(int[] array) {
		this.array = array;
		tempArray = new int[array.length];
	}
	
	public void mergeSort(int low, int high) {
		if(low>=high)
			return;
		int middle = (low+high)/2;
		mergeSort(low,middle);
		mergeSort(middle+1,high);
		merge(low,middle,high);
	}
	
	private void merge(int low, int middle, int high) {
		for(int i=low;i<=high;i++)
			tempArray[i] = array[i];
		int i=low, j=middle+1, k=low;
		while(i<=middle && j<=high) {
			if(tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}
			else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k] = tempArray[i];
			i++;
			k++;
		}
		while(j<=high) {
			array[k] = tempArray[j];
			j++;
			k++;
		}
	}
	
	public void showArray() {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+"  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {23,67,12,34,21,56,-98,89,56,75,36,0,43,-76};
		MergeSort ms = new MergeSort(nums);
		ms.mergeSort(0, nums.length - 1);
		ms.showArray();

	}

}
