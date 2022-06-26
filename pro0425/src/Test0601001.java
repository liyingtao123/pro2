import java.util.Scanner;

public class Test0601001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1= sc.nextLong();
        Long charnum = sc.nextLong();
        System.out.println(cacu(num1,charnum));
    }
    private static int cacu(long num1,long charnum){
        if (num1 <= 26){
            return 1;
        }
        int de =1;
        for (int i = 0; i <charnum ; i++) {
            de*=26;
        }
        int r=1;
        de*=10;
        while ( de < num1){
            de*=10;
            r++;
        }
        return r;
    }
}
