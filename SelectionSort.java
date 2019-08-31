package sorting;

public class SelectionSort {
	
	public void sortAndDisplay(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
			int index = i;
			for (int j=i+1; j<nums.length;j++) {
				if(nums[j] < nums[index]) 
					index = j;
			}
			if (index != i) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			}
		}
		
		for(int i =0;i<nums.length;i++)
			System.out.print(nums[i]+"  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,1,6,0,7,3,2,3,9};
		SelectionSort ss = new SelectionSort();
		ss.sortAndDisplay(nums);

	}

}
