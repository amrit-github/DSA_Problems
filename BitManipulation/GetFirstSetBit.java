public class GetFirstSetBit{

    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18));
    }
    public static int getFirstSetBit(int n) {
        // code here
        if(n == 0) return 0;
        
        int pos = 1;
        while((n & 1) == 0){
            n >>= 1;
            pos++;
        }
        return pos;
    }
}