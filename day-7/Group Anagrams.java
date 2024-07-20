class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = String.valueOf(ch);
            if(!groupedAnagrams.containsKey(sortedStr)){
                groupedAnagrams.put(sortedStr,new ArrayList<>());
            }
            groupedAnagrams.get(sortedStr).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}

Time Complexity: O(n * k log k)
Space Complexity: O(n * k)
