class Solution {
    public String intToRoman(int num) {
        String roman = "";
        String[] notations = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        for(int pos = 0; num>0;++pos){
            while(num >= val[pos]){
                roman += notations[pos];
                num -= val[pos];
            }
        }
        return roman;
    }
}

Time Complexity: O(1)
Space Complexity: O(1)
