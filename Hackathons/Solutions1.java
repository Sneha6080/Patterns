package Patterns.Hackathons;

import java.util.Stack;

public class Solutions1 {

    public static int[] removeConsecutiveSubsequences(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++){
            if (st.isEmpty() || st.peek()!=arr[i]) st.push(arr[i]);
            else if (st.peek()==arr[i]){
                if (i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int m = st.size();
        int[] result = new int[m];
        for (int i=m-1;i>=0;i--){
           result[i]=st.pop();
        }
        return result;
    }

    public static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        for (int i=n-2;i>=0;i--){
            while (!st.isEmpty() && st.peek()<arr[i] ){
                st.pop();
            }
            if (st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 1, 2, 1, 3, 4, 4, 4};
//        int[] arr = {1, 1, 1, 1, 2, 1, 3, 4, 5, 5, 5};
        int[] arr = {1,5,0,6,4,3};
//       int[] ans = removeConsecutiveSubsequences(arr);

        int[] ans = nextGreaterElement(arr);

        for (int an : ans) {
            System.out.print(an + " ");
        }

    }
}
