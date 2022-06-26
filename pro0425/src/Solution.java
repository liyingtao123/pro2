import java.util.*;

class Solution {

    Map<Integer, List<Integer>> map1;
    Random random = new Random();
    public Solution(int[] nums) {
        map1=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            List<Integer> list = map1.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map1.put(nums[i],list);
        }
    }

    public int pick(int target) {
       List<Integer> list= map1.get(target);
       int index = list.get(random.nextInt(list.size()));
       return index;
    }

    public static int  longestCommonSubsequence(String text1, String text2) {
        int num1=text1.length();
        int num2=text2.length();
        int[][] dp= new int[num1+1][num2+1];
        for (int i = 1; i <=num1 ; i++) {
            for (int j = 1; j <=num2 ; j++) {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] =Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[num1][num2];
    }




   //692. 前K个高频单词
    public List<String> topKFrequent(String[] words, int k) {

        class Item {
            private String word;
            private Integer count;

            public Item(String word, Integer count) {
                this.word = word;
                this.count = count;
            }
        }
        Map<String,Integer> map =  new HashMap<>();
        for (String val:words) {
            if (map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else {
                map.put(val,1);
            }
        }
        List<Item> list = new ArrayList<>();
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            Item item = new Item(entry.getKey(),entry.getValue());
            list.add(item);
        }
        list.sort((o1, o2) -> {
            if(o1.count != o2.count) {
                return o2.count-o1.count;
            }
            return o1.word.compareTo(o2.word);
        });
        List<String> list1 = new ArrayList<>();
        for (int i=0;i<k;i++){
            list1.add(list.get(i).word);
        }
        return list1;
    }





    /*1305. 两棵二叉搜索树中的所有元素
    给你 root1 和 root2 这两棵二叉搜索树。请你返回一个列表，其中包含 两棵树 中的所有整数并按 升序 排序。
    */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            inorder(root1,list1);
            inorder(root2,list2);
            List<Integer> merged = new ArrayList<>();
            merged.addAll(list1);
            merged.addAll(list2);
            merged.sort((o1, o2) -> o1-o2);

            return merged;
    }

    public void inorder(TreeNode node,List<Integer> res){
        if (node != null){
            inorder(node.left,res);
            res.add(node.val);
            inorder(node.right,res);
        }
    }


    public List<Integer> getAllElements1(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        cengxu(root1,list1);
        cengxu(root2,list2);
        List<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        merged.sort((o1, o2) -> o1-o2);

        return merged;
    }

    public  void cengxu(TreeNode node,List<Integer> res){
        Queue<TreeNode> que = new ArrayDeque<>();
        if(node != null){
            que.add(node);
        }
        while (!que.isEmpty()){
            TreeNode node1 = que.poll();
            //que.peek();
            res.add(node1.val);
            if (node1.left !=null){
                que.add(node1.left);
            }
            if (node1.right != null){
                que.add(node1.right);
            }
        }
    }


//    public static void main(String[] args) {
//        int[] num ={3,4,5,63,2,4};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i<num.length;i++){
//            list.add(num[i]);
//        }
//        Collections.reverse(list);
//        for (int i=0;i<num.length;i++){
//            num[i] = list.get(i);
//        }
//        System.out.println(Arrays.toString(num));
//    }



//515. 在每个树行中找最大值
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root ==null){
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max,node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }
    public static void main(String[] args) {
//        int[][] ns={{1,2,3,4},{5,6,7,8},{11,12,13,14}};
//        int[] arr = ns[2];
//        System.out.println(Arrays.toString(arr));
//        for (int[] arr:ns) {
//            for (int n:arr) {
//                System.out.print(n);
//                System.out.print(',');
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(ns));

        Person person = new Person("李四",7);
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(6);
        System.out.println(person1.getName()+"    "+person1.getAge());
        System.out.println(person.getName()+"    "+person.getAge());

    }
}
class Person{
    private String name;
    private  int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}