import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


public class Main {

    //121. 买卖股票的最佳时机
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int num1 =Integer.MAX_VALUE;
        int num2 = 0;
        for (int i = 0; i <n ; i++) {
            if (prices[i] <num1){
                num1 = prices[i];
            }
            num2 = Math.max(num2,prices[i]-num1);
        }
        return num2;
    }

    /**200.给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
    岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
    此外，你可以假设该网格的四条边均被水包围。*/
    public int numIslands(char[][] grid) {
        int n1 = grid.length;
        int n2 = grid[0].length;
        int res =0;
        for (int i = 0; i <n1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                if (grid[i][j]=='1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    void dfs(char[][] grid,int i,int j){
        int n1 = grid.length;
        int n2 = grid[0].length;
        if(i<0 || j<0 || i>=n1 || j>=n2 ||grid[i][j]=='0'  ){
            return;
        }
        grid[i][j] ='0';
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
    }




    public int orangesRotting(int[][] grid) {
        int n1 = grid.length;
        int n2 = grid[0].length;
        int count =0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i <n1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                if (grid[i][j] == 1){
                    count++;
                }else if (grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int res =0;
        while (count >0 && !queue.isEmpty()){
            res++;
            int len = queue.size();
            for (int i = 0; i <len ; i++) {
                int [] ora = queue.poll();
                int num1 = ora[0];
                int num2 = ora[1];
                if (num1-1 >=0 && grid[num1-1][num2] == 1){
                    grid[num1-1][num2] = 2;
                    count--;
                    queue.add(new int[]{num1-1,num2});
                }
                if (num1+1 <n1 && grid[num1+1][num2] == 1){
                    grid[num1+1][num2] = 2;
                    count--;
                    queue.add(new int[]{num1+1,num2});
                }
                if (num2-1 >=0 && grid[num1][num2-1] == 1){
                    grid[num1][num2-1] = 2;
                    count--;
                    queue.add(new int[]{num1,num2-1});
                }
                if (num2+1 <n2 && grid[num1][num2+1] == 1){
                    grid[num1][num2+1] = 2;
                    count--;
                    queue.add(new int[]{num1,num2+1});
                }
            }
        }
        if (count > 0){
            return -1;
        }else {
            return res;
        }
    }




    //373. 查找和最小的 K 对数字

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <Math.min(nums1.length,k) ; i++) {
            for (int j = 0; j <Math.min(nums2.length,k) ; j++) {
                res.add(Arrays.asList(nums1[i],nums2[j]));
            }
        }
        res.sort(Comparator.comparingInt(item ->item.get(0)+item.get(1)));
        int len = Math.min(res.size(),k);
        return res.subList(0,len);
    }





    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        String a ="12";
//        String b = "1"+2;
//        System.out.println(a==b);

//        Object p = new Person1("Xiao Ming");
//        Class c = p.getClass();
//        Field f = c.getDeclaredField("name");
//        Object value = f.get(p);
//        System.out.println(value); // "Xiao Ming"


//        Person1 person1 = new Person1("xiaoming");
//        System.out.println(person1.getName());
//        Class c = person1.getClass();
//        Field f = c.getDeclaredField("name");
//        f.setAccessible(true);
//        f.set(person1,"xiaohong");
//        System.out.println(person1.getName());

//        Method h = Person1.class.getMethod("hello");
//        h.invoke( new Student());

//        Constructor con1 = Integer.class.getConstructor(int.class);
//        Integer n1 = (Integer) con1.newInstance(123);
//        System.out.println(n1);
//        Constructor con2 = Integer.class.getConstructor(String.class);
//        Integer n2 = (Integer) con2.newInstance("456");
//        System.out.println(n2);

//        Class a = Integer.class;
//        System.out.println(a);
//        Class b = a.getSuperclass();
//        System.out.println(b);
//        Class c = b.getSuperclass();
//        System.out.println(c);
//        System.out.println(c.getSuperclass());

//        Class a = Integer.class;
//        Class[] is = a.getInterfaces();
//        for (Class s:is){
//            System.out.println(s);
//        }
//        int i=1;
//        int j=2;
//        for (; i <=5 ; i++) {
//            for (; j <=5 ; j++) {
//                if (j==3){
//                    break;
//                }
//                System.out.print(j++);
//            }
//            i++;
//        }
//        System.out.print("-");
//        System.out.print(i);
//        System.out.print(j);


        for (int i = 2; i <=5 ; i++) {
            if (i==3){
                break;
            }
            System.out.println(i++);
        }
    }

}


class Person1{
    public void hello() {
        System.out.println("Person:hello");
    }
}
class Student extends Person1{
    public void hello() {
        System.out.println("Student:hello");
    }

}

