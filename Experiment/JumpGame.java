package Experiment;

class Solution1 {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
    }
}

public class JumpGame {
    public static void main(String[] args) {
       
        Solution1 solution = new Solution1();

  
        int[] nums = {2, 3, 1, 1, 4};

        int result = solution.jump(nums);

        System.out.println("Minimum number of jumps: " + result);
    }
}