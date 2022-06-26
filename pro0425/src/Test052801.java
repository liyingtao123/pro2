import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test052801 {
    //第k个排序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            int[] arr = new int[n+1];
            arr[0] = 1;
            int fact = 1;
            for (int i = 1; i <=n ; i++) {
                list.add(i);
                fact *= i;
                arr[i] = fact;
            }
            k--;
            for (int i = n-1; i >=0 ; i--) {
                int index = k/arr[i];
                sb.append(list.remove(index));
                k-=index*arr[i];
            }
            System.out.println(sb.toString());
        }
    }
}
