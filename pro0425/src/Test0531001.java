import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test0531001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        int flag =1;
        for (int i = 0; i <str.length ; i++) {
            if (flag ==1){
                if ('Y' == str[i].charAt(2)){
                    list2.add(str[i].charAt(0));
                }else {
                    list1.add(str[i].charAt(0));
                    flag=2;
                }
            }else if (flag==2){
                if ('Y' == str[i].charAt(2)){
                    list1.add(str[i].charAt(0));
                }else {
                    list2.add(str[i].charAt(0));
                    flag=1;
                }
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i <list2.size() ; i++) {
            System.out.print(list2.get(i)+" ");
        }
    }
}
