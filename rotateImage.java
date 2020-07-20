class Solution {
    public void rotate(int[][] matrix) {
        
        if(matrix.length == 1) {
            return;
        }
        
        for (int i = 0; i < matrix.length; i++){
            for(int j =i; j <matrix.length; j++) {
                int temp = matrix[i][j];
                System.out.println(temp);
                System.out.println(matrix[j][i]);
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        
        for (int l = 0; l < matrix[0].length; l++) {
            for (int k = 0; k < matrix[0].length/2; k ++) {
                int temp = matrix[l][k];
                matrix[l][k] = matrix[l][matrix.length - k - 1];
                matrix[l][matrix.length - k - 1] = temp;
                
            }
        }
        
        
        
    }
}
