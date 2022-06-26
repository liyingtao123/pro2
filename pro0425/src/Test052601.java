import java.util.*;

public class Test052601 {
    //最大N个数和最小N个数的和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] arr = new int[num1];
        for (int i = 0; i <num1 ; i++) {
            arr[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int val:arr){
            set.add(val);
        }
        int res =0;
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);
        int n= list.size();
        if (2*num2 >set.size()){
            System.out.println("-1");
        }else {
            int sum1 =0;
            int sum2 =0;
            for (int i = 0; i <num2 ; i++) {
                sum1+=list.get(i);
            }
            for (int i = n-1; i >(n-1-num2) ; i--) {
                sum2+=list.get(i);
            }
             res =sum1+sum2;
            System.out.println(res);
        }

    }
}
