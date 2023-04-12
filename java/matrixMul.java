class test{
    public static void main(String[] args){
        int[][] x = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] y = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] c = new int[3][3];
       System.out.println("multiplication of matrixs ");  
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
         c[i][j] = x[i][j]*y[i][j];
          System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
          System.out.println("product of matrixs "); 
          for(int i = 0; i<3; i++){
            for(int j =0; j<3; j++){
            sum = sum+c[i][j];
            }
          }
          System.out.println(sum); 
    }
}