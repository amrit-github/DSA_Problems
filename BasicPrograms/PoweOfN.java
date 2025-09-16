public class PoweOfN {

    public static void main(String[] args) {
        int ans = power(2, 11);
        System.out.println(ans);
    }

    static int power(int x, int n){

        if(n == 0) return 1;
        return x * power(x, n-1);
    }
}
