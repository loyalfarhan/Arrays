package Arrays.array2d;

public class digonalSum {
    // public int digonalSum(int[][]mat){
    //     int sum=0;
    //     int len=mat.length;
    //     for (int i = 0;  i< len; i ++) {
    //         sum+=mat[i][i]+mat[i][len-i-1];
            


           
    //     }
    //     return len%2==0 ? sum: sum-mat[len/2][len/2];
    // }


    

    // public static void main(String[] args) {
    //     int[][] mat={{2,3,4,5},
    //     {6,7,8,9},
        
    //     {1,2,3,4},
    //     {5,6,7,8}};
        
    // }
    
    
    public  static int digonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){

            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!=matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];

        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,4,5},
                        {4,5,5,6},
                         {3,4,5,6},
                        {4,5,8,8}};
    }
}
