import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.util.stream.*;

public class SummeraTal {
  public Scanner sc = new Scanner(System.in);

  public SummeraTal() {
    int n = sc.nextInt();
    int[] number_list = new int[n];
    for (int i = 0; i < n; i++){
      int number = sc.nextInt();
      number_list[i] = number;
    }
    if (n%2 == 1){
      n = (n+1)/2;
    }
    else {
      n = n/2;
    }
    int[] largest_sum = new int[n];
    int n_length = number_list.length;
    Arrays.sort(number_list);
    for(int i = 0; i < largest_sum.length ; i++){
      largest_sum[i] = number_list[n_length-(i+1)];
  }
  System.out.println(IntStream.of(largest_sum).sum());
}
    public static void main(String args[]){
      new SummeraTal();
    }
  }
