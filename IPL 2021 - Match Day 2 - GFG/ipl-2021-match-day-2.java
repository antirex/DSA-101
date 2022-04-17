// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dum = new LinkedList<>();
        int i = 0, j = 0;
        int max = 0;
        while(j<n){
           while(dum.size()>0 && dum.getLast()<arr[j]) dum.removeLast();
           dum.add(arr[j]);
           if(j-i+1==k){
               list.add(dum.peek());
               if(dum.peek()==arr[i]) dum.remove();
               i++; j++;
           }else j++;
        }
        return list;
    }
}


// PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
// for(int i =0;i<n;i++){
//     pq.add(arr[i]);
//     if(pq.size()>=k){
//       list.add(pq.peek());
//       pq.remove(arr[i-k+1]);
//     } 
// }