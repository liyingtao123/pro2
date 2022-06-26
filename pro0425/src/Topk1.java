import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Topk1 {
    //373. 查找和最小的 K 对数字
    class Item{
        private int sum;
        private int[] nums;

        public Item(int sum, int[] nums) {
            this.sum = sum;
            this.nums = nums;
        }
    }
    public List<List<Integer>> kSmallestPairs3(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Item> pq = new PriorityQueue<>(((o1, o2) -> o2.sum-o1.sum));
          for (int m = 0; m <Math.min(nums1.length,k) ; m++) {
              for (int n = 0; n <Math.min(nums2.length,k) ; n++) {
                  if (pq.size()<k ){
                    int sum = nums1[m]+nums2[n];
                    pq.add(new Item(sum,new int[]{nums1[m],nums2[n]}));
                  }else {
                    Item item1 = pq.peek();
                    int sum1 = nums1[m]+nums2[n];
                    if (item1.sum > sum1){
                        pq.poll();
                        pq.add(new Item(sum1,new int[]{nums1[m],nums2[n]}));
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!pq.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Item item = pq.poll();
            list.add(item.nums[0]);
            list.add(item.nums[1]);
            res.add(list);
        }
        return res;
    }

    //658. 找到 K 个最接近的元素
    public List<Integer> findClosestElements4(int[] arr, int k, int x) {
        class Test{
            private int num;
            private int minus;

            public Test(int num, int minus) {
                this.num = num;
                this.minus = minus;
            }
        }
        PriorityQueue<Test> pq = new PriorityQueue<>(((o1, o2) -> o2.minus-o1.minus));
        for (int i = 0; i <arr.length ; i++) {
            if (pq.size()< k){
                int n1 = Math.abs(arr[i]-x);
                pq.add(new Test(arr[i],n1));
            }else {
                Test test = pq.peek();
                int n1 = Math.abs(arr[i]-x);
                if (test.minus >n1){
                    pq.poll();
                    pq.add(new Test(arr[i],n1));
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()){
            Test test = pq.poll();
            list.add(test.num);
        }
        list.sort(Comparator.comparingInt(o -> o));
        return list;
    }
}
