// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int res = 0;
        while(l < r){
            int area = (r-l) * (Math.min(arr[l], arr[r]));
            res = Math.max(area, res);
            if(arr[l] < arr[r]){
                l = l+1;
            } else {
                r = r-1;
            }
        }
        return res;
        
    }
}