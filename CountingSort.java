package sorting;

public class CountingSort {
	private int[] array;
	
	public CountingSort(int[] nums) {
		this.array = nums;
	}
	
	public void countingSort(int max,int min) {
		int[] countArray = new int[max-min+1];
		for(int i=0;i<array.length;i++)
			countArray[array[i]-min]++;
		int z = 0;
		for(int i=min;i<=max;i++)
			while(countArray[i-min]>0) {
				this.array[z]=i;
				z++;
				countArray[i-min]--;
			}
	}
	
	public void showArray() {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+"  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,1,7,1,10,3,7};
		CountingSort cs = new CountingSort(nums);
		cs.countingSort(10,1);
		cs.showArray();

	}

}
