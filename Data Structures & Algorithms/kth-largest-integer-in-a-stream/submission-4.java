class KthLargest {
    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.queue = new PriorityQueue(k);
        this.k = k;

        //add the top kth elements to the queue
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    //maintain queue of top k values
    public int add(int val) {
        queue.add(val);

        while (queue.size() > k) {
            queue.poll();
        }

        return queue.peek();
    }
}
