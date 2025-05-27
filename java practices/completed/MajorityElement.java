package completed;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
        public int majorityElement(int[] nums) {
            
            Map<Integer, Integer> counter = new HashMap<>();
            for (int i: nums) {
                counter.put(i , counter.getOrDefault(i, 0) + 1);
            }

            int n = nums.length/2;

            for (Map.Entry<Integer,Integer> i : counter.entrySet()){
                if (i.getValue() > n) return i.getKey();
            }

            return 0;
    }
}
