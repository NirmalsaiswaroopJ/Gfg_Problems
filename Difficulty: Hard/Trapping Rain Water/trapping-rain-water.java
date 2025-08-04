class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        int left_max = 0;
        int right_max = 0;
        int water = 0;
        while(left < right){
            if(arr[left] < arr[right]){
                if(arr[left] > left_max){
                    left_max = arr[left];
                    
                } else{
                    water += left_max - arr[left];
                }
                left++;
            } else{
                if(arr[right] > right_max){
                    right_max = arr[right];
                } else{
                    water += right_max -arr[right];
                }
                right--;
            }
            
        }
        return water;
    }
}
