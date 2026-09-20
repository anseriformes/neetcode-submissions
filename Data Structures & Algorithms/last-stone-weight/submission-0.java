class Solution {
    public int lastStoneWeight(int[] stones) {
        int result = 0;

        //use priorityqueue in reverse order to reference the maximum values
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());

        //add stones to the queue
        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
        }

        //simulate the stone interaction behavior
        while (queue.size() >= 2) {
            int stone1 = queue.poll();    //heaviest
            int stone2 = queue.poll();

            if (stone1 == stone2) {
                //do nothing - both stones are destroyed
            } else {
                //destroy the smaller and insert the new stone with weight = stone1 - stone2
                queue.add(stone1 - stone2);
            }
        }

        //return weight of 1 remaining stone if present, else 0
        if (!queue.isEmpty()) {
            result = queue.poll();
        }

        return result;
    }
}
