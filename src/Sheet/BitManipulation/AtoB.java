package Sheet.BitManipulation;

import java.util.Scanner;

//You are given two numbers A and B. The task is to count the number of bits needed to be
// flipped to convert A to B.

public class AtoB{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b= in.nextInt();
        int c=a^b;
        int count=0;
        while(c!=0){
            c&=(c-1);
            count++;
        }
        System.out.println(count);
    }
}
