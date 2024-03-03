package Src.Recursion.BasigRecursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println(String.format("Fibonacci of %d is %d",n,fibonacciFunc(10)));
        
        System.out.print("Fibonacci series up to " + n + ":-> ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciFunc(i) + " ");
        }
    }
    static int fibonacciFunc(int n){
        if (n<2) {  
            return n;
        }
        int x =  fibonacciFunc(n-1)+fibonacciFunc(n-2);
        return x;
    }
}
