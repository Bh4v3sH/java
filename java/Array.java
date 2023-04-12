import java.util.*;
class test{
    public static void main(String[] args){
        int temp=0;
        int[] x = {10,8,99,4,5,6,7,2,3};
        for(int i = 0; i<x.length; i++){
            for(int j=i+1; j<x.length; j++){
         if(x[i]>x[j]){
temp = x[i];
x[i] = x[j];
x[j] = temp;
         }
            }
       
         }
       
            System.out.println("the smallest number is = "+x[0] +" and largest number is = "+x[8]);
        }
    }