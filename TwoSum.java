import java.util.HashMap;


public class TwoSum {
	public static void main(String[] arg) 
    { 

    }
    public static int[] twoSum(int[] nums, int target) {
		HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
		int remainer;
		
        for(int i = 0; i < nums.length; i++){
        	remainer = target - nums[i];
        	if(hmap.containsKey(remainer)) {
        		return new int[] {hmap.get(remainer), i};
        	}
        	hmap.put(nums[i], i);
        }
		return nums;
    }

}