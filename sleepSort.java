package sorting;
import java.util.concurrent.CountDownLatch;


public class sleepSort {
	
	public void sleepSortAndPrint(int[] nums) {
		
		CountDownLatch countLatch = new CountDownLatch(nums.length);
		
		for (Integer num:nums) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					countLatch.countDown();
					try {
						countLatch.await();
						Thread.sleep(num*100);
						System.out.print(num+" ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
	

}
