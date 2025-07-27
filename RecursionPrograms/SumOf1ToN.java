package RecursionPrograms;

public class SumOf1ToN {

    public static void main(String[] args) {
        
        System.out.println(sum(1,10));
    }

    static int sum(int i, int n){

        if(i > n) return 0;
        return i + sum(++i, n);
    }
}