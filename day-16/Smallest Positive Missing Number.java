class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        if(arr == null || arr.length == 0) return 1;
        int containsOne = 0;
        for(int i=0;i<size;i++){
            if(arr[i] == 1) {
                containsOne = 1;
            }
            else if(arr[i] <= 0 || arr[i] > size){
                arr[i] = 1;
            }
        }
        if(containsOne == 0) return 1;
        
        for(int i=0;i<size;i++){
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] > 0) arr[index] = -1 * arr[index];
        }
        
        for(int i=0;i<size;i++){
            if(arr[i] > 0){
                return i+1;
            }
        }
        return size + 1;
    }
}
Time Complexity: O(n)
Space Complexity: O(1)
