class test{
    public static void main(String[] args){
      int[] x = {1,2,3,4,5};
      try{
        System.out.println(x[6]);
      }
      catch(ArrayIndexOutOfBoundsException a){
        System.out.println("array index is not available that You are 
        trying to fetch");
      }
      
    }
}
