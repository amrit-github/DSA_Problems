// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public class LeftAlignedHill {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 2*n - 1; i++){
            int k = i;
            if(i > 5){
                k = 2*n - i;
            }
            for(int j = 1; j <= k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
