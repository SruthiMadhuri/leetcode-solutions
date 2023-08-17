class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i = 0; i < n; i++){
            q.add(nums[i]);
            if (q.size() > k) q.remove(q.peek());
        }
      return q.peek();  
    }
}