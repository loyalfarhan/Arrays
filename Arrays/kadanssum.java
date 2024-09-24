package Arrays;

public class kadanssum {


    public static void  kadanssum(int nums[]){
        int ms=Integer.MIN_VALUE;
         int cs=0;
        for(int i=0; i<nums.length; i++){
            cs =cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
            
            
        }
        System.out.print(ms);
    }

    public static void main(String[] args) {
        int nums[]={2,4,-3,5,1-2,9};
        kadanssum(nums);
        
        
    }
    
    
    
}
