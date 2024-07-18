import java.util.*;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(max_capacity(height));
    }
    public static int max_capacity(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while(left < right){
            int area = Math.min(height[left],height[right]) * (right - left);
            maxArea = Math.max(area,maxArea);

            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
