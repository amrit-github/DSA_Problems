package RecursionPrograms;

public class DecimalToBinaryRecursion {

    public static void main(String[] args) {
        
        String sb = "";
        
        StringBuilder stringBuilder = new StringBuilder(decimalToBinary(43, sb)).reverse();
        System.out.println(stringBuilder);
    }

    /*
     *  43 ÷ 2 = 21 remainder 1
        21 ÷ 2 = 10 remainder 1
        10 ÷ 2 = 5 remainder 0
        5 ÷ 2 = 2 remainder 1
        2 ÷ 2 = 1 remainder 0
        1 ÷ 2 = 0 remainder 1

        Now read the remainders bottom to top →
        ✅ 43 in binary = 101011
     */
    static String decimalToBinary(int num, String sb){

        if(num >= 1){
            sb += num % 2;
            return decimalToBinary(num / 2, sb);
        }
        return sb;
    }
}