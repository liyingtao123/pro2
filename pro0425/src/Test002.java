import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        String str = "Zhang San";
        Adjust1(str);
//        System.out.println(str.substring(6,8));
    }
    public static void Adjust( String str){
        String s = str.toString().replaceAll(" ",".");
        int count=0;
        int index =-1;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isUpperCase(s.charAt(i))){
                count++;
            }
            if (count==2){
                index=i;
                break;
            }
        }

        String sb =s.substring(0,index+1);
        StringBuilder ss = new StringBuilder();
        ss.append(sb.charAt(sb.length()-1));
        ss.append(sb.charAt(sb.length()-2));
        for (int i = 0; i <sb.length()-2 ; i++) {
            ss.append(sb.charAt(i));
        }
        System.out.println(ss.toString());
    }
    public static void Adjust1( String str){
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(arr[1].charAt(0)).append(".").append(arr[0]);
        System.out.println(sb.toString());
    }

}
