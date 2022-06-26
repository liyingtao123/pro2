import java.util.Scanner;

public class Test053001 {
    //最大矩阵和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int max = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int num1 =0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                num1+=arr[i][j];
            }
            max =Math.max(max,num1);
        }
        int num2 =0;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = m-1; j >=0 ; j--) {
                num2+=arr[i][j];
            }
            max =Math.max(max,num2);
        }
        int num3 =0;
        for (int j = 0; j <m ; j++) {
            for (int i = 0; i <n ; i++) {
               num3+=arr[i][j];
            }
            max = Math.max(max,num3);
        }
        int num4 =0;
        for (int j = m-1; j >=0 ; j--) {
            for (int i = n-1; i >=0 ; i--) {
                num4+=arr[i][j];
            }
            max = Math.max(max,num4);
        }
        System.out.println(max);
    }
}
