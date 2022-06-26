import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test0608 {
    public static void main(String[] args) {
        String[] arr ={"a","e","i","o","u","A","E","I","O","U"};
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList(arr);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int max=0;
            for (int i = 0; i <line.length() ; i++) {
                int len =0;
                while (i<line.length()){
                    String s = line.substring(i,i+1);
                    if (list.contains(s)){
                        len++;
                        i++;
                        max = Math.max(max,len);
                    }else {
                        max = Math.max(max,len);
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
