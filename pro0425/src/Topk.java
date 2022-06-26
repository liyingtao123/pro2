import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//373. 查找和最小的 K 对数字
public class Topk {
    class Item{
        private int sum;
        private int[] nums;

        public Item(int sum, int[] nums) {
            this.sum = sum;
            this.nums = nums;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Item> pq = new PriorityQueue<>((o1, o2) -> o2.sum-o1.sum);
        for (int i = 0; i <Math.min(nums1.length,k) ; i++) {
            for (int j = 0; j <Math.min(nums2.length,k) ; j++) {
                if (pq.size()<k){
                    int as = nums1[i]+nums2[j];
                    pq.add(new Item(as,new int[]{nums1[i],nums2[j]}));
                }else {
                   Item item1 = pq.peek();
                   int as = nums1[i]+nums2[j];
                   if (item1.sum > as){
                       pq.poll();
                       pq.add(new Item(as,new int[]{nums1[i],nums2[j]}));
                   }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!pq.isEmpty()){
            Item item2 = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(item2.nums[0]);
            list.add(item2.nums[1]);
            res.add(list);
        }
        return res;
    }




    //658. 找到 K 个最接近的元素

    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        int len = arr.length;
        int left =0;
        int right = len-1;
        int num = len-k;

        while (num>0){
            if(x - arr[left] <= arr[right] - x){
                right--;
            }else {
                left++;
            }
            num--;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <left+k ; i++) {
            res.add(arr[i]);
        }
        return res;
    }




    //658. 找到 K 个最接近的元素
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        class Item{
            private int num;
            private int minus;

            public Item(int num, int minus) {
                this.num = num;
                this.minus = minus;
            }
        }
        PriorityQueue<Item> pq = new PriorityQueue<>((o1, o2) -> o2.minus-o1.minus);
        for (int i = 0; i <arr.length ; i++) {
            if (pq.size() < k){
                int num1 = Math.abs(arr[i]-x);
                pq.add(new Item(arr[i],num1));
            }else {
               Item item = pq.peek();
               int num = Math.abs(arr[i]-x);
               if (num < item.minus){
                   pq.poll();
                   pq.add(new Item(arr[i],num));
               }
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()){
            Item item = pq.poll();
            list.add(item.num);
        }
        list.sort(Comparator.comparingInt(o -> o));
        return list;
    }

}
