package Src.Recursion.BasigRecursion;

public class OnetoN {
    public static void main(String[] args) {
        printOneToN(5);
        System.out.println("--------");
        printNtoOne(5);
    }
    static void printNtoOne(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
    }
    static void printOneToN(int n){
        if (n==0) {
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
}
