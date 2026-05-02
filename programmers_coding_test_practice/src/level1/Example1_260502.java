package level1;

import java.util.HashSet;

public class Example1_260502 {
    public int solution(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            numsSet.add(nums[i]);
            if (numsSet.size() == nums.length/2){
                break;
            }
        }
        int answer = numsSet.size();
        return answer;
    }
}
