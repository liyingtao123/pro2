import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test0531 {
    //找朋友
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[num];
        for (int i = 0; i <num ; i++) {
            for (int j = i+1; j <num ; j++) {
                if (arr[j] >arr[i]){
                    arr1[i] = j;
                    break;
                }
            }
        }
        for (int val:arr1){
            System.out.print(val+" ");
        }
    }
}
