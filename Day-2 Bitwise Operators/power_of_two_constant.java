// Power of two or not
//Example 6 is false and 4 is true
//explanation of the condition used
//when you subract one from the number in the binary representation the zeros after the last set bit number becomes one and last set bit becomes zero
//this is how its works
//n  =40 - 101000 
//n-1=39 - 100111 doing the and of these both two gives 
//         ______
//n&(n-1)  100000  = 32 so its not equal to zero so its false
//         ‾‾‾‾‾‾

import java.util.*;
class poweroftwo{
 public static boolean power(int n){
    if(n==0)
        return true;
    return((n & (n-1))==0);
 }
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(power(n));
    scn.close();
 }
}
