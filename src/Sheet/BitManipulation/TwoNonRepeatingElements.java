package Sheet.BitManipulation;

import java.util.Scanner;

//Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs
// whereas the other two number occur exactly once and are distinct. Find the other two numbers.

public class TwoNonRepeatingElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int ans=0;
        for(int i = 0; i < arr.length; i++){
            ans=(ans)^(arr[i]);
        }
        ans=(ans)&(~(ans-1));
        int setbit=0;
        int nonSetBit=0;
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]&ans)>0){
                setbit=setbit^arr[j];
            }
            else{
                nonSetBit=nonSetBit^arr[j];
            }
        }
        System.out.println("The two numbers are: "+(setbit)+" and "+(nonSetBit));
    }
}
