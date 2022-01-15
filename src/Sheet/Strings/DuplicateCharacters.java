package Sheet.Strings;

import java.util.Scanner;

//Print all the duplicates in the input string

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S= in.nextLine();
        char[] arr=new char[S.length()];
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<S.length();i++) {
            sb.append(S.charAt(i));
        }
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
            int count=0;
            for(int j=i;j<sb.length();j++){
                if(i==j){
                    count++;
                    continue;
                }
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                    sb.deleteCharAt(j);
                }
            }
            System.out.println(" "+count);
            if(sb.length()==1){
                break;
            }
        }
    }
}
