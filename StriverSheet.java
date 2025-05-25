//3
// 1
// 12
// 123
// 1234
// 12345

//4
// 1
// 22
// 333
// 4444
// 55555

//5
// *****
// ****
// ***
// **
// *

//6
// 12345
// 1234
// 123
// 12
// 1

//7
//     *    
//    ***   
//   *****  
//  ******* 
// *********

//8
// *********
//  ******* 
//   *****  
//    ***   
//     *  

//9
//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *    

//10
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

//11
// 1
// 01
// 101
// 0101
// 10101

// 12
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

// 13
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

// 14
// A
// AB
// ABC
// ABCD
// ABCDE

// 15
// ABCDE
// ABCD
// ABC
// AB
// A

// 16
// A 
// B B 
// C C C 
// D D D D 
// E E E E E 

// 17
//      A     
//     ABA    
//    ABCBA   
//   ABCDCBA  
//  ABCDEDCBA 

// 18
// E
// DE
// CDE
// BCDE
// ABCDE

// 19
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
public class StriverSheet {
    public static void main(String[] args) {
        
        print19(5);
    }

    static void print3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void print5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print6(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print7(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print8(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*n - (2*i - 1); j++){
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print9(int n){
        print7(n);
        print8(n);
    }
    static void print10(int n){
        for(int  i = 1; i <= 2*n - 1; i++){
            if(i <= 5){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 1; j <= 2*n - i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void print11(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            if( i % 2 == 0){
                start = 0;
            }else{
                start = 1;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void print12(int n){
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print13(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(start);
                System.out.print(" ");
                start++;
            }
            System.out.println();
        }
    }
    static void print14(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void print15(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch < 'A' + n - i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void print16(int n){
        
        for(int i = 0; i < n; i++){
            char ch = (char)('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print17(int n){
        for(int i = 0; i < n; i++){
            
            for(int j = 1; j < n-i+1; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2*i + 1)/2;
            for(int j = 1; j <= 2*i + 1; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print18(int n){
        for(int i = 0; i < n; i++){
            char start = (char)('E' - i);
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
    static void print19(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j + i < n; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j + i < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int intS = 2*n - 2;
        for(int i = 5; i < 2*n; i++){
            for(int j = 1; j <= i-n+1; j++){
                System.out.print("*");
            }

            for(int j = 1; j <= intS; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i-n+1; j++){
                System.out.print("*");
            }
            intS -= 2;

            System.out.println();
        }
    }
 
  







}
 