import java.util.ArrayList;
import java.util.List;

public class proj062301 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int n= nums.length;
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<n;i++){
                if(nums[i] ==target){
                    list.add(i);
                }
            }
            int num =list.size();
            if (num !=0){
                return new int[]{list.get(0),list.get(num-1)};
            }else {
                return new int[]{-1,-1};
            }
        }
    }
}
