class Solution {
    public int[][] kClosest(int[][] points, int k) {
               PriorityQueue<int[]> queue = new PriorityQueue<>(
               (a,b) -> b[0] - a[0]
       );
       for (int [] point : points) {
           int distSq = point[0]*point[0] + point[1]*point[1];
           queue.offer(new int[]{distSq, point[0],point[1]});

           if(queue.size() > k) {
               queue.poll();
           }
       }
       int [][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int [] point = queue.poll();
            result[i] = new int[]{point[1],point[2]};
        }
        return result;

    }
}
