import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i=0;
        int n = words.length;

        while(i < n){
            int j = i+1;
            int lineLength = words[i].length();
            while(j < n && (lineLength + words[j].length() + (j-i-1) < maxWidth)){
                lineLength += words[j].length();
                ++j;
            }
            //calculate the diff
            int diff = maxWidth - lineLength;
            //Amount of words in a line
            int numberOfWords = j - i;

            if(numberOfWords == 1 || j >= n) result.add(leftJustify(words,diff,i,j));
            else result.add(middleJustify(words,diff,i,j));

            i=j;
        }
        return result;
    }
    private String leftJustify(String[] words, int diff, int i, int j){
        int spacesOnRight = diff - (j - i - 1);

        StringBuilder ans = new StringBuilder(words[i]);
        for(int k = i+1; k < j; k++){
            ans.append(" " + words[k]);
        }
        ans.append(" ".repeat(spacesOnRight));
        return ans.toString();
    }
    private String middleJustify(String[] words,int diff, int i, int j){
        int spacesNeeded = j - i - 1;
        int spaces = diff / spacesNeeded;
        int extraSpaces = diff % spacesNeeded;

        StringBuilder ans = new StringBuilder(words[i]);
        for(int k = i+1; k < j; k++){
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            ans.append(" ".repeat(spacesToApply) + words[k]);
        }
        return ans.toString();
    }
}

Time Complexity: O(lines * maxWidth)
Space Complexity: O(lines * maxWidth)
