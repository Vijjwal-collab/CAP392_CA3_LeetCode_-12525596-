class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long divider = 1; 
        
        while (divider <= n) {
            long dividerTimes10 = divider * 10;
            
            long higher = n / dividerTimes10;
            long current = (n / divider) % 10;
            long lower = n % divider;
           
            if (current == 0) {
                count += higher * divider;
            } 
            
            else if (current == 1) {
                count += higher * divider + lower + 1;
            } 
           
            else {
                count += (higher + 1) * divider;
            }
            
            divider = dividerTimes10;
        }
        
        return count;
    }
}
