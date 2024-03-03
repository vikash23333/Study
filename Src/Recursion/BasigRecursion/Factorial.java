package Src.Recursion.BasigRecursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("facto:-  "+facto(15));
    }
    static int facto(int n){
        if (n==1 || n==0 || n<0) {
            return 1;
        }
        return n*facto(n-1);
    }
    
}
