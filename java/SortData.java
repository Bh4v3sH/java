class sortData{
 void asec(){
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
            System.out.println("data is asending ordered");
     for(int i=0;i<10;i++)
      System.out.println(x[i]);
}
 void desc(){
int[] x ={10,20,50,30,40};
      for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(x[i]<x[j]){
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
      }
      System.out.println("data is desending ordered");
     for(int i=0;i<5;i++)
      System.out.println(x[i]);
 }
public static void main(String[] args){
    sortData s = new sortData();
    s.asec();
    s.desc();
}
}