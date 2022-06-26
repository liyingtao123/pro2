import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test0528 {
    //数字涂色
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        int res =1;
        if (num > 100){
            return;
        }
        for (int i = 1; i <num ; i++) {
            if (arr[i] % arr[0] != 0){
                set.add(arr[i]);
            }
        }
        res +=set.size();
        System.out.println(res);
    }
}
