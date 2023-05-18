package slot.pkg3;

import java.util.Scanner;

public class TestPeterson {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        int test = a;
        int sum ;
        int num ;
        int value = 1;
        int count = 0;
        while(a > 0){
         sum = a % 10; 
         num = a / 10;
          for(int i = sum ; i > 0 ; i--){
              value = value * i;
               }
         count += value;
         value = 1;
         a = num;
    }  
        if(count == test ){
        System.out.println("That is peterson number");
        }else { System.out.println("That is not peterson number"); }
 }
}
