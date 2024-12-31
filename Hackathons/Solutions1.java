package Patterns.Hackathons;

import java.util.ArrayList;
import java.util.List;
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
    public String[] findWords(String[] words) {  //["Hello","Alaska","Dad","Peace"]

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> list = new ArrayList();

        for (String word : words){
            int[] row = new int[3];
            for (char ch : word.toLowerCase().toCharArray()){  // [H, e, l, l, a]
                if (row1.indexOf(ch)!=-1){
                    row[0]=1;
                } else if (row2.indexOf(ch)!=-1) {
                    row[1]=1;
                } else if (row3.indexOf(ch)!=-1) {
                    row[2]=1;
                }
            }
            int sum = row[0]+row[1]+row[2];
            if (sum==1)
                list.add(word);
        }
        String[] str = new String[list.size()];
        int i = 0;
        for (String s : list){
            str[i++]=s;
        }
        return str;
    }


    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> str = new ArrayList<>();

        int n = words.length;
        int i=0;
        while (i<n){
            int letterCount = words[i].length();
            int space = 0;
            int j = i+1;

            while (j<n && words[j].length()+1+space+letterCount<=maxWidth){
                letterCount+=words[j].length();
                space+=1;
                j++;
            }

            int remainingSpace = maxWidth-letterCount;
            int eachSpace = space==0 ? 0 : remainingSpace/space;
            int extraSpace = space==0 ? 0 : remainingSpace%space;

            if(j==n){
                eachSpace=1;
                extraSpace=0;
            }
            str.add(findLine(i, j, eachSpace, extraSpace, words, maxWidth));
            i=j;
        }
        return str;

    }
   public static String findLine(int i, int j, int eachSpace, int extraSpace, String[] string, int maxWidth){
     String line = "" ;
     for (int k=i;k<j;k++){
         line+=string[k];

         if(k==j-1){
             break;
         }
         for (int z=0;z<eachSpace;z++){
             line+=" ";
         }
         if (extraSpace>0){
             line+=" ";
             extraSpace--;
         }
     }
     while (line.length()<maxWidth){
         line+=" ";
     }
     return line;
    }

    public boolean exist(char[][] board, String word) {
        char[] word_ch = word.toCharArray();

        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if (board[i][j]==word_ch[0] && exists(board, i, j, word_ch, 0) )
                    return true;
            }
        }
        return false;
    }
    public static boolean exists(char[][] board, int i, int j, char[] word, int index){

        if ( index >word.length|| i<0 || i>board.length || j<0 || j>board[0].length||board[i][j]!=word[index] || board[i][j] =='*' ) return  false;

        if (index==word.length-1) return true;

        char ch = board[i][j];
        board[i][j] = '*';
        boolean res =
        exists(board, i+1, j, word, index) ||
        exists(board, i-1, j, word, index) ||
        exists(board, i, j+1, word, index) ||
        exists(board, i, j-1, word, index) ;

        board[i][j] = ch;
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
