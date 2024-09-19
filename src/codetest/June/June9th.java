package codetest.June;

public class June9th {
    public static void main(String[] args) {

       int result = fiboo(4);
        System.out.println("result = " + result);

    }
// fibbo(1), fibbo(0)
    public static int fiboo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboo(n - 1) + fiboo(n - 2);

    }
}
