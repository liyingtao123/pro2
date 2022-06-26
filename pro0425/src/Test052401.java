import java.util.Arrays;
import java.util.Scanner;

public class Test052401 {
    //字符串序列判定
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int res = -1;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0,j = 0; i<arr1.length && j<arr2.length ; j++) {
            if (arr1[i] == arr2[j]){
                res = j;
                i++;
            }
        }
//        for (int i = 0; i<arr1.length ; i++) {
//            for (int j = 0; j<arr2.length; j++) {
//                if (arr1[i] == arr2[j]){
//                    res = j;
//                }
//            }
//        }
        System.out.println(res);
    }
}
