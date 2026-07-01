class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        int max = 0;

        for (int x : milestones) {
            sum += x;
            max = Math.max(max, x);
        }

        long others = sum - max;

        if (max <= others + 1)
            return sum;

        return 2 * others + 1;
    }
}