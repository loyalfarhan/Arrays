package Arrays;

public class MaxSubarraySum {
    public static int MaxSubarraySum(int nums[]){
        int sum=0;
        int max_sum=nums[0];
        for(int i=0; i<nums.length; i++){

            sum=sum+nums[i];

            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubarraySum(nums));
    }
}
