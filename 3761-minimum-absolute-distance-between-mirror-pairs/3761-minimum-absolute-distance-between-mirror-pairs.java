class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int outer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            int current=nums[i];
            if (map.containsKey(current)) {
                int in = map.get(current);
                ans = Math.min(ans, i - in);
            }
            int rev=vin(current);
            map.put(rev, i);
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    private int vin(int el) {
        int res = 0;
        while (el != 0) {
            int r = el % 10;
            res = (res * 10) + r;
            el /= 10;
        }
        return res;
    }
}