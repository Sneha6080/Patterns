package Patterns;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        String ans = convertToTitle(701);
//        patternPrintRectangleNumbers(5);
//        patternPrintRectangleStar(5);
//        patternPrintRectangleCharacter(5);
//        continuePatternPrintRectangleNumber(3);
//        continuePatternPrintRectangleCharacter(4);
//        patternPrintTriangleStar1(9);
//        patternPrintTriangleNumber1(5);
        patternPrintTriangleCharacter1(5);
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
}

