//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int lpf = -1;
        while(n%2 == 0){
            lpf = 2;
            n = n/2;
        }
        for(int i = 3; i*i <= n; i += 2){
            while (n % i == 0) {
                lpf = i;
                n /= i;
            }
        }
        if (n > 2) {
            lpf = n;
        }
        return lpf;
    }
}