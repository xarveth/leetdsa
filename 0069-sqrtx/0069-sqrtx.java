class Solution {
    public int mySqrt(int x) {
        if ( x == 0 || x == 1) {
            return x;
        }
        int i = 0 ;
        while ((long) i*i <= x ) {
            i++;
        }
        return i-1;
         
    }
}