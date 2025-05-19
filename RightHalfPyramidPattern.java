// Program to Print Right Half Pyramid Pattern (Star Pattern)
// Given an integer N, print N rows of right half pyramid pattern. In right half pattern of N rows, the first row has 1 star, second row has 2 stars and so on till the Nth row which has N stars. All the stars are left aligned.
// *
// **
// ***
// ****
// *****
public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
