/**
 * Given an integer N, the task is to print N rows of left half pyramid pattern. In left half pattern of N rows, the first row has 1 star, second row has 2 stars and so on till the Nth row which has N stars. All the stars are right aligned.
 * 
 */
//     *
//    **
//   ***
//  ****
// *****
public class LeftHalfPyramidPattern {

    public static void main(String[] args) {

        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j >= n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
