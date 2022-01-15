package Sheet.Strings;

import java.util.Arrays;
import java.util.Scanner;

//Write a function that reverses a string. The input string is given as an array of characters s.

public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder builder=new StringBuilder();
        char[] s=new char[5];
        for(int i=0;i<5;i++) {
            s[i] = in.nextLine().charAt(0);
        }

//        *****First Method*******
        for(int i=0;i<(s.length)/2;i++){
            int start=i;
            int end=s.length-1-i;
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
        }
        System.out.print("[");
        for(int i=0;i<5;i++){
            System.out.print("\""+s[i]+"\"");
            if(i<4){
                System.out.print(",");
            }
        }
        System.out.print("]");

//        ********Second Method********
        for(int i=0;i<s.length;i++){
            builder.append(s[i]);
        }
        builder.reverse();
        System.out.print("[");
        for(int i=0;i<builder.length();i++){
            System.out.print("\""+builder.charAt(i)+"\"");
            if(i<builder.length()-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
