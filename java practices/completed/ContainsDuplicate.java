package completed;

import java.util.HashSet;


public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> checker = new HashSet<>();
        
        for (int i : nums){
            if (checker.contains(i)) return true;
            else checker.add(i);
        }
        return false;
    }
    
}
