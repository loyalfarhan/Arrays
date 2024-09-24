package Arrays;



public class troppingWater {
    
    public static int troppingWater(int height[]){
        int n = height.length;

// firssst  we calculate the max boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=0; i<n; i++){
            leftMax[i]=Math.max(height[i],  height[i-1]);
        }

        //2nd we calculate right max boundary
        int rightMax[] =new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i], height[i+1]);
        }

        ///we run a loop 
        int trappwatter=0;
        for(int i=0; i<n; i++){
            ///we calculate water levele=math.max(left bounding, right max bounding)
            int waterlevel= Math.max(leftMax[i], rightMax[i]);
            // we calculate trapped water 
            trappwatter+=waterlevel-height[i];

        }
        return trappwatter;
    }
    

    public static void main(String[] args) {
        int height[]={1,3,5,2,8,4};
        System.out.println(troppingWater(height));
    }

    
    }

