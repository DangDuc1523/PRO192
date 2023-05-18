package slot.pkg3;

import java.util.Scanner;

public class nearear {
    public static void main(String[]args){
     int n;
     int a[];
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of array: ");
     n = sc.nextInt();
     a = new int [n];
       for ( int i = 0 ; i< n ; i++){
         System.out.print("a"+i+" = ");
         a[i] = sc.nextInt();
     }
     int sum = 0;
       for ( int i = 0 ; i< n ; i++){
         sum = sum + a[i];
     }
     System.out.println("sum = " + sum);
     float arg = sum / n;
     int value = a[0]  ;
      for ( int i = 1 ; i< n ; i++){  
        if (Math.abs(a[i] - arg) < Math.abs(value - arg)){
         value = a[i];} 
     }
      System.out.println("arg = "+ value);
    }
}
