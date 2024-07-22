class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        if(s == null || p == null || s.isEmpty() || p.isEmpty()) return "-1";

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        //initialize the variables
        int i=0, j=0 , count=map.size();
        int left = 0, right = s.length()-1, minLength = s.length();
        boolean found = false;

        while(j < s.length()){
            char endChar = s.charAt(j++);
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar) - 1);
                if(map.get(endChar) == 0) count -= 1;
            }
            if(count > 0) continue;

            while(count == 0){
                char startChar = s.charAt(i++);
                if(map.containsKey(startChar)){
                    map.put(startChar,map.get(startChar) + 1);
                if(map.get(startChar) > 0) count += 1;
            }
            }
            if((j-i) < minLength){
                left = i;
                right = j;
                minLength = j-i;

                found = true;
            }
        }
        return !found ? "-1" : s.substring(left-1,right); //[left-1,right-1]
    }
}

Time Complexity: O(n + m)
Space Complexity: O(n)
