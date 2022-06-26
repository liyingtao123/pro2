import java.util.*;

public class Toltal {


    //904. 水果成篮
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left = 0;
        int right = 0;
        int count = 0;
        int res = 2;
        if (n<2){
            return n;
        }
        int[] fru = new int[n];
        while (right<n){
            fru[fruits[right]]++;
            if (fru[fruits[right]]==1){
                count++;
            }
            right++;
            while (count>2){
                fru[fruits[left]]--;
                if (fru[fruits[left]]==0){
                    count--;
                }
                left++;
            }
            res = Math.max(res,right-left);
        }
        return res;
    }



    public int totalFruit1(int[] fruits) {
        int res = 0;
        int left = 0;
        int right =0;
        int n = fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int key:fruits){
            if (map.containsKey(key)) {
                int val = map.get(key) + 1;
                map.put(key,val);
            }else {
                map.put(key,1);
            }
            right++;
            while (map.size()>2){
                int val = map.get(fruits[left])-1;
                if (val == 0){
                    map.remove(fruits[left]);
                }else {
                    map.put(fruits[left],val);
                }
                left++;
            }
            res = Math.max(res,right-left);
        }
        return  res;
    }




    //示例 1：
    //输入：asteroids = [5,10,-5]
    //输出：[5,10]
    //解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();
        int n= asteroids.length;
        int i = 0;
        while (i<n){
            boolean flag =false;
            while (!s.isEmpty() && (asteroids[i] * s.peek())<0){
                if (asteroids[i] <0 && Math.abs(s.peek()) > Math.abs(asteroids[i])){
                    flag = true;
                    break;
                }else if (asteroids[i] <0 && Math.abs(s.peek()) < Math.abs(asteroids[i])){
                    s.pop();
                }else if (asteroids[i] <0 && Math.abs(s.peek()) == Math.abs(asteroids[i])){
                    s.pop();
                    flag=true;
                    break;
                }else
                    break;
            }
            if (!flag){
                s.push(asteroids[i]);
                i++;
            }
        }
        int num = s.size();
        int[] res = new int[num];
        for (int j = res.length-1;j>=0;j--){
            res[j] = s.pop();
        }
        return res;
    }


    public int[] asteroidCollision1(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <asteroids.length ; i++) {
            while ( !stack.isEmpty() && stack.peekFirst()>0 && stack.peekFirst()<-asteroids[i]){
                stack.pollFirst();
            }
            if (stack.isEmpty() || asteroids[i] >0 || stack.peekFirst() <0){
                stack.push(asteroids[i]);
            }else if (!stack.isEmpty() && asteroids[i] <0 && stack.peekFirst() == asteroids[i]){
                stack.pollFirst();
            }
        }
        int n =stack.size();
        int[] res = new int[n];
        for (int i = 0; i <n ; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
