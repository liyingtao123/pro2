import java.util.Scanner;

public class Test0525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum=0;
        for (int i = 0; i <str.length ; i++) {
            for (int j = i+1; j <str.length ; j++) {
                int num = Math.min(arr[i],arr[j])*(j-i);
                if (num>sum)
                    sum = num;

            }
        }
        System.out.println(sum);
    }
}
