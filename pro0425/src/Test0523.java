import java.util.Arrays;
import java.util.Scanner;

public class Test0523 {
    //字符串筛选排序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int n= str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        if (k > n){
            for (int i = 0; i <n ; i++) {
                if (Character.isLowerCase(arr[i])){
                    char ch = arr[i-1];
                    if (ch == str.charAt(i)){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }else {
            char ch1 = arr[k-1];
            for (int i = 0; i <n ; i++) {
                if (ch1 == str.charAt(i)){
                    System.out.println(i);
                }
            }
        }
    }
}
