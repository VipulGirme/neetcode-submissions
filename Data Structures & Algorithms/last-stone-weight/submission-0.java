class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones)
            queue.add(i);

        while (queue.size() >= 2) {
            int max1 = queue.poll();
            int max2 = queue.poll();

            if(max1 == max2) continue;
            queue.add(max1 - max2);
        }

        return queue.isEmpty() ?0 : queue.poll();
    }
}
