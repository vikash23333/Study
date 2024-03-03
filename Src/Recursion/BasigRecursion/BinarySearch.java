package Src.Recursion.BasigRecursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] l = {1,2,4,5,6,7,8,9};
        int answer =binarySearch(9,l,0,l.length-1);
        System.out.println("answer:- "+answer);

    }
    public static int binarySearch(int n, int[] list, int s, int e){
        if (s>e) {
            return -1;
        }
        int m = s+(e-s)/2;
        if (list[m]==n) {
            return m;
        }
        if(list[m]>n){
            return binarySearch(n,list, s,m-1);
        }
        return binarySearch(n,list, m+1,e);
    }
}
