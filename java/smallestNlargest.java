class test{
    public static void main(String[] args){
      int[] x ={1,4,2,3,8,5,6,9,7,0};
      for(int i=0;i<10;i++){
        for(int j=i+1;j<10;j++){
            if(x[i]>x[j]){
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
      }
     System.out.println("smallest number is "+x[0]+" largest number is "+x[9]);
    }
}