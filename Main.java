package Patterns;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void patternPrintRectangleNumberAndCharacter1(int n) {
        int k = 1;
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i%2==1){
                    System.out.print(k + " ");
                    k++;
                }
                else {
                    System.out.print(c + " ");
                    c++;
                }
            }
            System.out.println();
        }
    }
    public static void patternPrintRectangleNumberAndCharacter2A(int n) {
        int k = 1;
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i%2==1){
                    System.out.print(k + " ");
                }
                else {
                    System.out.print(c + " ");
                }
            }
            if (i%2==1)
                k++;
            else
                c++;
            System.out.println();
        }
    }

    public static void patternPrintRectangleNumberAndCharacter2B(int n) {
        int k = 1;
        char c = 'A';
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                flag=true;
            }else{
                flag=false;
            }
            for (int j = 1; j <= n; j++) {
                if(flag){
                    System.out.print(c + " ");
                }
                else {
                    System.out.print(k + " ");
                }
            }
            if (flag)
                c++;
            else
                k++;
            System.out.println();
        }
    }

    public static void patternPrintTriangleCharacter1(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch = (char) (ch + 1);
            System.out.println();
        }
    }

    public static void patternPrintTriangleNumber1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void patternPrintTriangleStar1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternPrintTriangleNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void continuePatternPrintRectangleCharacter(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(k + " ");
                k = (char) (k + 1);
            }
            System.out.println();
        }
    }

    public static void continuePatternPrintRectangleNumber(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void patternPrintRectangleNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternPrintRectangleStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternPrintRectangleCharacter(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }

    public static void triangleContinuosNumber(int n){
        int num = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static  void  reverseNumberPattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=i;j>0;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static  void patternOfTriangleNumber(int n){

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void patternOfReverseTriangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j>=i){
                    System.out.print(i + " ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pyramidPatternTriangle(int n){
        int k;
        for (int i=0;i<n;i++){
            k=1;
            for (int j=0;j<n*2;j++){
                if (j>n-i&&j<n+i){
                    System.out.print(k + " ");
                    k = (j < n) ? k + 1 : k - 1;
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void hollowDiamondPattern(int n){
        int k=1;
        for (int i=1;i<n*2;i++){
            for (int j=1;j<n*2;j++){
                if (j==n+1-k || j==n-1+k){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            k = (i<n)? k+1:k-1;
           System.out.println();
        }
    }

    public static void butterFlyPattern(int n){
        int k = 1;
        for (int i=1;i<n*2;i++){
            for (int j=1;j<n*2;j++){
                if (j<=k || j>=n*2-k){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            k = i<n ? k+1 : k-1;
            System.out.println();
        }
    }
  public static void printDiamond(int n){
        int k=1;
        for (int i=1;i<=n*2;i++){
            for (int j=1;j<n*2;j++){
                if (j==n-k || j==n+k){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            k = (i<n)? k+1: k-1;
            System.out.println();
        }

    }
    public static void printPattern(int N){
     for (int i=1;i<=N;i++){
         for (int j=1;j<=i;j++){
             System.out.print("*");
         }
         System.out.print(" ");
     }
    }
    public static void main(String[] args) {
        printPattern(3);
//        printDiamond(3);
//
//   butterFlyPattern(4);
//
//*           *
//* *       * *
//* * *   * * *
//* * * * * * *
//* * *   * * *
//* *       * *
//*           *

//        hollowDiamondPattern(4);
//      *
//    *   *
//  *       *
//*           *
//  *       *
//    *   *
//      *

//        pyramidPatternTriangle(6);
//          1
//        1 2 1
//      1 2 3 2 1
//    1 2 3 4 3 2 1
//  1 2 3 4 5 4 3 2 1

//        patternOfReverseTriangle(5);
//        1 1 1 1 1
//        2 2 2 2
//        3 3 3
//        4 4
//        5

//       patternPrintRectangleNumbers(3);
//        1 2 3
//        1 2 3
//        1 2 3
//       System.out.println();
//       patternPrintRectangleStar(4);
//       * * * *
//       * * * *
//       * * * *
//       * * * *
//        System.out.println();
//        patternPrintRectangleCharacter(4);
//        A B C D
//        A B C D
//        A B C D
//        A B C D
//        System.out.println();
//        continuePatternPrintRectangleNumber(3);
//        1 2 3
//        4 5 6
//        7 8 9
//        System.out.println();
//       continuePatternPrintRectangleCharacter(4);
//        A B C D
//        E F G H
//        I J K L
//        M N O P

//        System.out.println();
//        patternPrintTriangleStar1(4);
//          *
//          * *
//          * * *
//          * * * *
//        System.out.println();
//        patternPrintTriangleNumber1(5);
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        System.out.println();
//        patternPrintTriangleCharacter1(5);
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        System.out.println();
//        patternPrintRectangleNumberAndCharacter1(4);
//        1 2 3 4
//        A B C D
//        5 6 7 8
//        E F G H
//        System.out.println();
//        patternPrintRectangleNumberAndCharacter2A(4);
//        1 1 1 1
//        A A A A
//        2 2 2 2
//        B B B B
//        System.out.println();
//        patternOfTriangleNumber(5);
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

//        reverseNumberPattern(5);
//        1
//        2 1
//        3 2 1
//        4 3 2 1
//        5 4 3 2 1
//        System.out.println();
//        triangleContinuosNumber(4);
//        1
//        2 3
//        4 5 6
//        7 8 9 10
    }
}

