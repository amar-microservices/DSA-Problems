package Algorithms.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		Integer[] nums = { 1, 3, 2, 4, 5, 9};
		int target = 9;
		Integer[] results = twoSum(nums, target);
		System.out.println(Arrays.toString(results));
	}
	// Brute-Force approach
	private static Integer[] twoSum1(Integer[] nums, Integer target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new Integer[] { i, j };
				}
			}
		}
		return new Integer[] {-1,-1};
	}
	
	// Optimized approach
	private static Integer[] twoSum(Integer[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if(hashMap.containsKey(compliment)) {
				return new Integer[] {i, hashMap.get(compliment)};
			}
				hashMap.put(nums[i], i);
		}
		return new Integer[] {-1, -1};
	}
}
