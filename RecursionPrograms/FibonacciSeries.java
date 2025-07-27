package RecursionPrograms;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        System.out.println(fib(50));
    }

    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }   
}

    //   3
    //  /  \
    //  2   1   
    // / \    
    // 1  0   

    // 1