package Arrays.array2d;

public class sorteadMatrix {
    public static boolean  starecaseSerch(int matrix[][],int key){
        int row=0, col=matrix[0].length-1;

        while(row<matrix.length&& col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{12,34,56,26},{45,67,89,43},{34,56,87,54},{45,32,67,43}};
        int key=43;
        starecaseSerch(matrix, key);
    }
    
}
