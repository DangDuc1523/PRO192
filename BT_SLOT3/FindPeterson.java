package slot.pkg3;

import java.util.Scanner;

public class FindPeterson{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int sum;
      int value;
      int rem;
      int test;
      int count ;
        // cho chạy từ 0 đến 1000 và gán biến test vào i để kiểm tra số
      for(int i = 0 ; i <= 1000 ; i++){
          test = i;
          count = 0;
          // tính và so sánh
          while(test > 0){
            value = test % 10;
               rem = test / 10;
               sum = 1;
                for(int n = 1 ; n <= value ;n++){
                     sum *= n;  }
                       test = rem;
                       count += sum;  }
          // nếu tích = số i thì in ra
       if(count == i ){ System.out.println(i+" ");
        }
       }
    }
}
