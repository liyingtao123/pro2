import java.util.Arrays;
import java.util.Scanner;

public class Test0526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        for (int i = 0; i <n2 ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int Tmax = 0;
        int sum =0;
        for (int i = 0; i <n1 ; i++) {
            for (int j = i; j <n2 ; j+=n1) {
                sum+=arr[j];
                Tmax = Math.max(Tmax,sum);
            }
            sum = 0;
        }
        System.out.println(Tmax);
    }
}
