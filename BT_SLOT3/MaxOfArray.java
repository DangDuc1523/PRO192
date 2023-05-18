package slot.pkg3;

import java.util.Scanner;

public class MaxOfArray {

    public static void main(String[] args) {
        int[] a = new int[3];
        for(int i = 0 ; i < 3 ;i++){
        System.out.print("Enter the number " + (i+1) +" : " );
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        int max = a[0];
        if(max < a[1]){
            max = a[1];
        }
        if(max < a[2]){
            max = a[2];
        }
        System.out.println("max " + max);
    } 
}
