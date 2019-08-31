package sorting;

public class BubbleSort {
	
	public void sortAndPrint(int[] nums) {
		for(int i = 0; i<nums.length-1; i++)
			for(int j = 0; j<nums.length-i-1; j++)
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
		for(int i = 0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,2,6,8,5,6,9,-3,6,7};
		BubbleSort bs = new BubbleSort();
		bs.sortAndPrint(nums);

	}

}
