class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int x = 0;
        for(int i = 0;i<stones.length;i++)
        {
            maxHeap.add(stones[i]);
        }
        while(maxHeap.size()>1)
        {
            int biggest = maxHeap.peek();
            maxHeap.remove(biggest);
            int biggest_2 = maxHeap.peek();
            maxHeap.remove(biggest_2);
            if(biggest!=biggest_2){
                maxHeap.add(biggest-biggest_2);
            }
            
        }
        if(maxHeap.isEmpty()) return 0;

        return maxHeap.peek();
    }
}
