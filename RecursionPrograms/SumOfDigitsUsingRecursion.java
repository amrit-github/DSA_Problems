package RecursionPrograms;

public class SumOfDigitsUsingRecursion {

    public static void main(String[] args) {
        
        //int sum = 0;
        //System.out.println(sumOfDigits(sum, 9987));
        System.out.println(sumOfD(9987));
    }

    static int sumOfDigits(int sum, int n){
        if(n == 0) return sum;
        sum += n % 10;
        n /= 10;
        return sumOfDigits(sum, n);
    }

    //2nd approach
    static int sumOfD(int n){
        if(n == 0) return 0;
        return sumOfD(n/10) + n%10;
    }
}