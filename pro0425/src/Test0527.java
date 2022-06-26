import java.util.Arrays;
import java.util.Scanner;

public class Test0527 {
    //组成最大数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        String max = "";


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (!max(Long.parseLong(arr[i]+""+arr[j]),Long.parseLong(arr[j]+""+arr[i]))){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            max=max.concat(arr[i]+"");
        }
        System.out.println(max);
    }
    private static boolean max(Long a , Long b) {
        return a > b ;
    }
}
