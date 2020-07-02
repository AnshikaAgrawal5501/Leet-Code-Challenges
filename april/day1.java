/**
 * Single Number

Solution
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */


class day1 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int store=nums[0];
        int cnt=1;
        
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i]==store)
                cnt++;
            else
            {
                if (cnt==1)
                    break;
                store=nums[i];
                cnt=1;
            }
        }
        
        return store;
    }
}