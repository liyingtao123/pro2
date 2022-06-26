import java.util.Scanner;

public class Test052301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr = new int[num2];
        int count = 0;
        int sum =0;
        for (int i = 0; i <num2 ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            if (num1 >= arr[i]){
                count++;
            }else {
                sum+=arr[i];
            }
        }
        if (sum > sum/num1*num1){
            System.out.println(count+sum/num1+1);
        }else {
            System.out.println(count+sum/num1);
        }
    }
}
