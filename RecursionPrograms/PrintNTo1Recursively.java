package RecursionPrograms;

public class PrintNTo1Recursively {

    public static void main(String[] args) {
        
        fun(5);
        fun1(5);
    }

    //1st approach
    static void fun(int n){

        System.out.println(n);
        if(n == 1) return;
        fun(n - 1);
    }

    //2nd approach
    static void fun1(int n){
        if(n == 0) return;
        System.out.println(n);
        fun1(n - 1);
    }
}