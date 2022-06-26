
import java.util.Scanner;

public class Test0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            arr[i] =str.charAt(i) ;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i])){
                int num = (int) Integer.parseInt(String.valueOf(arr[i]));
                for (int j = 0; j < num-1 ; j++) {
                    sb.append(arr[i+1]);
                }
            }else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
