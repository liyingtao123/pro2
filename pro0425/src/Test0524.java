import java.util.*;

public class Test0524 {
    //数组去重和排序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue()-o1.getValue());
        for (int i = 0; i <list.size() ; i++) {
            Map.Entry<Integer,Integer> entry = list.get(i);
            if (i != list.size()-1 ){
                System.out.print(entry.getKey()+",");
            }else {
                System.out.println(entry.getKey());
            }
        }
    }
}
