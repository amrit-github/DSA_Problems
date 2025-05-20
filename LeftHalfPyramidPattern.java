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

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i + j >= 4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
