public class CountSetBits {

    public static void main(String[] args) {
        int n = 29; // Example input
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n));
    }

    static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
