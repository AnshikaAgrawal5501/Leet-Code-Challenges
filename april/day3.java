/**
 * Maximum Subarray

Solution
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

class day3
 {
    public int maxSubArray(int[] nums) {
        int sum=0, max=nums[0];
        for (int i=0; i<nums.length; i++)
        {
            for (int j=i; j<nums.length; j++)
            {
                sum=0;
                for (int k=i; k<=j; k++)
                {
                    sum=sum+nums[k];
                }
                
                if (sum>max)
                    max=sum;
            }
        }
        return max;
    }
}