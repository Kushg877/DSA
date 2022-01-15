package Sheet.BitManipulation;

import java.util.Scanner;

public class CountTotalSetBits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= 4;
        int count=0;
        for (int i = 1; i <=a; i++) {
            int b=i;
            while(b!=0){
                b&=(b-1);
                count++;
            }
        }
        System.out.println(count);
    }
}
