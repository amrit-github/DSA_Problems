public class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber(258);
    }

    static void reverseNumber(int num){

        int newNum = 0;
        while(num != 0){
            int mod = num % 10;
            num = num / 10;
            newNum = newNum * 10 + mod;
        }
        System.out.println(newNum);
    }
}
