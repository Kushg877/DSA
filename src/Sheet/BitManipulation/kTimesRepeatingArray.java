package Sheet.BitManipulation;

// FIND NON REPEATING ELEMENT IN ARRAY WHERE ELEMENTS ARE REPEATING K TIMES

import java.util.Arrays;
import java.util.Scanner;

public class kTimesRepeatingArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int[] res=new int[32];
        int k= in.nextInt(); // How many times elements are repeating in an array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 32; j++) {
                if(((arr[i])&(1<<j))>0){
                    res[j]+=1;
                }
            }
        }
        int ans=0;
        for (int i = 0; i < res.length; i++) {
            if((res[i]%k)==1){
                ans+=Math.pow(2,i);
            }
        }
        System.out.println(ans);

    }
}
