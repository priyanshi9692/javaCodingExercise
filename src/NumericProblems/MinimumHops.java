package NumericProblems;

public class MinimumHops {
    // O(n) Complexity
    public int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;
        if (nums[0] == 0)
            return -1;
        int maxReach = nums[0];
        int step = nums[0];
        int jump = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (i == nums.length - 1)
                return jump;
            maxReach = Math.max(maxReach, i+nums[i]);

            step--;
            if (step == 0)
            {
                jump++;
                if(i>=maxReach)
                    return -1;
                step = maxReach - i;
            }
        }

        return -1;
    }
    // O(n*i) time complexity
    public int hopCount(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int [] jump = new int[nums.length];
        jump[0]=0;
        for(int i=1; i<nums.length; i++){
            jump[i] = Integer.MAX_VALUE;
            for(int j=0; j<i; j++){
                if(i<=j+nums[j] && jump[j]!=Integer.MAX_VALUE){
                    jump[i] = Math.min(jump[i], jump[j]+1);
                }
            }
        }
        return jump[nums.length-1];
    }
    public static void main(String [] args){
        MinimumHops obj= new MinimumHops();
        int [] arr={2,3,1,1,4};
        System.out.println(obj.hopCount(arr));
        System.out.println(obj.jump(arr));
    }
}
