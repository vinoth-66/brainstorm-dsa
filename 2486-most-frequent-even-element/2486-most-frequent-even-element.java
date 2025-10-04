import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of even numbers
        for (int i : nums) {
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        int max = -1; // stores maximum frequency
        int v = -1;   // stores result (value)

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int key = m.getKey();
            int freq = m.getValue();

            if (freq > max) {
                max = freq;
                v = key;
            } else if (freq == max) {
                v = Math.min(v, key); // choose smaller key in case of tie
            }
        }
        
        return v;
    }
}
