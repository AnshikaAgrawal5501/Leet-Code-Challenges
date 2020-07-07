/**Hamming Distance

Solution
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ? x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ?   ?

The above arrows point to positions where the corresponding bits are different.

*/

class day5 {
    public int hammingDistance(int x, int y) {
        int xx[]=new int[32];
        int yy[]=new int[32];
        
        xx=binary(x);
        yy=binary(y);
        
        int cnt=0;
        for (int i=0; i<32; i++)
        {
            if (xx[i]!=yy[i])
                cnt++;
        }
        
        return cnt;
    }
    
    static int[] binary (int n)
    {
        int ar[]=new int[32];
        int i=0;
        while (n!=0)
        {
            ar[i]=n%2;
            n=n/2;
            i++;
        }
        return ar;
    }
}