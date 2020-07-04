/**
 * Happy Number

Solution
Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

class day2
 {
    public boolean isHappy(int n) {
        int d, sum=0, temp=n;
        do
        {
            sum=0;
            while (temp!=0)
            {
                d=temp%10;
                sum=sum+d*d;
                temp=temp/10;
            }
            temp=sum;
        }
        while (sum>9);
    
    if (sum==1 || sum==7)
        return true;
    else
        return false;
}
}