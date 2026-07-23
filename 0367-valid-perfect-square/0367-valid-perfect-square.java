class Solution {
    public boolean isPerfectSquare(int num) {
        int org = num;
        if (num == 0 || num == 1) {
            return true;
        }
        for (long i = 2; i <= org; i++) {

            if (i * i == org) {
                return true;
            }

        }
        return false;
    }
}