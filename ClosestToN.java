public class ClosestToN {

    public static void main(String[] args) {
        print(100, 3);
    }

    static void print(int n, int k) {

        int quotient = n / k;  //3 = 13/4
        int temp = quotient * k; // 12 = 3*4

        int minDiff = Math.abs(n - temp); // 1 = |13 - 12|
        int secondClosest = temp + k - n; // 16 = 12 + 4 - 13;

        int ans;
        if(minDiff < secondClosest){
            ans = temp;
        }else{
            ans = temp + k;
        }
        
        System.out.println("Closest number to " + n + " is: " + ans);
    }
}
