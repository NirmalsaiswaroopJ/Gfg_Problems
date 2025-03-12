//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

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
    static List<Integer> primeDivision(int n) {
        List<Integer> temp = new ArrayList<>();
        
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i)) {
                int other = n - i;
                if (isPrime(other)) {
                    temp.add(i);
                    temp.add(other);
                }
            }
        }
        return temp;
    }
}