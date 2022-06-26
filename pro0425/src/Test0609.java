import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int flag = 0;
        for (int i = 1; i <num ; i++) {
            flag = 1;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    flag=0;
                    break;
                }
            }
            if (flag==1){
                list.add(i);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i) * list.get(j) == num){
                    list1.add(list.get(i));
                    list1.add(list.get(j));
                }
            }
        }
        System.out.print(list1.get(0)+" ");
        System.out.print(list1.get(1)+" ");
    }
}
