import java.util.Scanner;

public class Test0601 {
    //比赛
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String[] str = sc.nextLine().split(",");
        int[][] arr = new int[num1][num2];
        for (int i = 0; i <num1 ; i++) {
            for (int j = 0; j <num2 ; j++) {
                 arr[num1][num2] = Integer.parseInt(str[i]);
            }
        }
    }
}
