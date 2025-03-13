//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++){
            temp[k] = arr1[i];
            k++;
        }
        for(int i = 0; i < arr2.length; i++){
            temp[k] = arr2[i];
            k++;
        }
        Arrays.sort(temp);
        int mid = temp.length / 2;
        
        if (temp.length % 2 != 0) {
            return temp[mid];
        } else {
            return (temp[mid - 1] + temp[mid]);
        }
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends