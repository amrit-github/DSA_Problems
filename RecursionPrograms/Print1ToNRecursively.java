package RecursionPrograms;

public class Print1ToNRecursively {

    public static void main(String[] args) {
        
        //int i = 1;
        //printFun(i, 5);
        printFun1(3);
    }

    //1st approach Tail Recursion which is faster
    static void printFun(int i, int n){

        if(i > n) return;
        System.out.println(i);
        printFun(++i, n);
    }

    //2nd approach
    static void printFun1(int n){
        if(n == 0) return;
        printFun1(n-1);
        System.out.println(n);
    }
}