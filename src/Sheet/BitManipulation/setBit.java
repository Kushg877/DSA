package Sheet.BitManipulation;

import java.util.Scanner;

//Given a positive integer N, print count of set bits in it.

public class setBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        System.out.println(count);
    }
}
