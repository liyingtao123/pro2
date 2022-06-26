import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        Long[] arr = new Long[str.length];
        for (int i = 0; i <str.length ; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        int jicount =0;
        int oucount =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 ==0){
                oucount++;
            }else {
                jicount++;
            }
        }
        int num = Math.abs(jicount-oucount);
        System.out.println(num);
    }
}
