import java.util.*;

public class Test0530 {
    //找出符合要求的字符串子串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i <str1.length() ; i++) {
//            for (int j = 0; j <str2.length() ; j++) {
//                if (str1.charAt(i) == str2.charAt(j)){
//                    set.add(str1.charAt(i));
//                }
//            }
//        }
//        List<Character> list = new ArrayList<>(set);
//        Collections.sort(list);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <list.size() ; i++) {
//            sb.append(list.get(i));
//        }
//        System.out.println(sb.toString());

        Set<String> set1 = new HashSet<>();
        for (int i = 0; i <str1.length() ; i++) {
            set1.add(str1.substring(i,i+1));
        }
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i <str2.length() ; i++) {
            String s = str2.substring(i,i+1);
            if (set1.contains(s)){
                set2.add(s);
            }
        }
        List<String> list = new ArrayList<>(set2);
        Collections.sort(list);
        System.out.println(String.join("",list));
    }

}
