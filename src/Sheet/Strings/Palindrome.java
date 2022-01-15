package Sheet.Strings;

import java.util.Scanner;

//Given a string S, check if it is palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String S=in.nextLine();

//        ***Method 1***
        StringBuilder builder1=new StringBuilder();
        for(int i=0;i<S.length();i++){
            builder1.append(S.charAt(i));
        }
        StringBuilder builder2=new StringBuilder(builder1);
        builder1.reverse();
        if(builder2.compareTo(builder1)==0){
            System.out.print("S is a palindrome");
        }
        else{
            System.out.print("S is not a plaindrome");
        }

//        ***Method 2****
        for(int i=0;i<(S.length())/2;i++){
            if(S.charAt(i)!=S.charAt(S.length()-1-i)){
                System.out.println(0);
            }
        }
        System.out.println(1);
    }
}
