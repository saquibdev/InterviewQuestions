class MicrosoftQuestion2 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(new Comparator<Double>()

        {

            public int compare(Double a, Double b) {

                return Double.compare(b, a);
            }

        });

        int minOperations = 0;

        double halfSum = 0;

        double totSum = 0;
        for (int i = 0; i < nums.length; i++) {

            pq.add((double)nums[i]);

            totSum = totSum + nums[i];
        }
      

        while (halfSum < (totSum) / 2.0) {

            double val = pq.poll();

            double y = val / 2.0;

            halfSum = halfSum + y;

            pq.add(y);

            minOperations++;

        }
        return minOperations;

    }
}
