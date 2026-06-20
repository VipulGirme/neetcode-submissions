class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<Integer>();
        this.k = k;
        for(int n: nums) {
            add(n);
        }
    }
    
    public int add(int val) {
        this.minHeap.offer(val);

        if(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
