import java.util.*;

public class Main {

    public static void printDuplicates(String str)
    {
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i < len - 1
                   && sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "test string";
        printDuplicates(str);
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(1)
