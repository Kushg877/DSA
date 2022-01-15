package Sheet.Arrays;

import java.util.Arrays;

public class noTwoAdjacentEqual {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,2,4,4};
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(i==arr.length-1){
                arr[i]+=1;
                count++;
                continue;
            }
            if(arr[i]==arr[i-1]){
                count++;
                arr[i]=arr[i+1]+1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
