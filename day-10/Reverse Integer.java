class Solution {
    public int reverse(int x) {
        long reversedNum = 0;
        while(x != 0){
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
            if(reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) return 0;
        }
        return (int)reversedNum;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
