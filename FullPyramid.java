//     *    
//    ***
//   *****
//  *******
// *********
public class FullPyramid {

    public static void main(String[] args) {
        
        int n = 5;
        int fullSize = n*2 - 1;
        for(int i = 1; i <= n; i++){
            int starsInRow = i*2 - 1;
            for(int j = 1; j <= fullSize; j++){
                int leftRightSpace = (fullSize - starsInRow)/2;
                if(j <= leftRightSpace || j > fullSize - leftRightSpace){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        } 
    }
}
