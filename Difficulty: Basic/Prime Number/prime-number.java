//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;  
        if (n % 2 == 0) return false;  
        for (int i = 3; i * i <= n; i += 2) {  
            if (n % i == 0) {
                return false;  
            }
        }
        return true;
        
    }
}